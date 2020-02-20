package com.example.favteam.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.Observer
import com.example.favteam.Models.Teams
import com.example.favteam.R
import com.example.favteam.viewmodel.FavTeamViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val favTeamViewModel: FavTeamViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewModel()
        btnSearch.setOnClickListener { setupSearchButton() }
    }

    private fun setupSearchButton() {
        favTeamViewModel.getLaunches(entered_word.text.toString())
    }

    fun initViewModel() {
        favTeamViewModel.getLaunches("").observe(this, Observer { teams -> populateUI(teams) })
    }

    fun populateUI(teams: Teams) {
        val arguments = Bundle()
        val imageUri = teams.teams?.get(0)?.strStadiumThumb

        arguments.putString("team_name", teams.teams?.get(0)?.strTeam ?: "Default ID")
        arguments.putString("imageUri", imageUri.toString() ?: "imageUri")
//        arguments.putString("team_name", teams.teams?.get(0)?.strTeam ?: "Default ID")

        val fragment = TeamDetailFragment()
        fragment.arguments = arguments
        supportFragmentManager.beginTransaction()
            .replace(R.id.team_detail_container, fragment)
            .commit()

    }
}
