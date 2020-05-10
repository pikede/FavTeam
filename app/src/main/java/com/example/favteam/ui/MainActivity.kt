package com.example.favteam.ui

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.favteam.Models.Team
import com.example.favteam.Models.Teams
import com.example.favteam.R
import com.example.favteam.viewmodel.FavTeamViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val favTeamViewModel: FavTeamViewModel by viewModel()
    private lateinit var mAdapter: DataAdapter
    private lateinit var dataset: List<Team>
    private lateinit var progress_Bar: ProgressBar
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progress_Bar = progressBar

        initRecycleView()
        initViewModel()
        btnSearch.setOnClickListener { setupSearchButton() }
    }

    private fun initRecycleView() {
        dataset = ArrayList<Team>()
        mAdapter = DataAdapter(dataset)
        recyclerView = recycle_view
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.visibility = View.GONE
        recyclerView.adapter = mAdapter
    }

    private fun setupSearchButton() {
        if (entered_word.text.isNotEmpty()) {
            setUpProgressBar()
            favTeamViewModel.getLaunches(entered_word.text.toString())
        }
    }

    private fun setUpProgressBar() {
        var handlerThread = Handler()
        var progressStatus = 0
        progress_Bar.visibility = View.VISIBLE
        Thread(Runnable {
            run {
                while (progressStatus < 100) {
                    progressStatus += 25
                    android.os.SystemClock.sleep(200)
                    handlerThread.post { progress_Bar.progress = progressStatus }
                }
                handlerThread.post {
                    progress_Bar.setProgress(100)
                    progress_Bar.visibility = View.GONE
                }
            }
        }).start()
        recyclerView.visibility = View.VISIBLE
    }

    fun initViewModel() {
        favTeamViewModel.getLaunches("").observe(this, Observer { teams -> populateUI(teams) })
    }

    fun populateUI(teams: Teams) {
        if (entered_word.text.isNotEmpty()) {
            dataset = teams.teams ?: emptyList()
            mAdapter.updateDataSet(dataset)
        }
    }
}
