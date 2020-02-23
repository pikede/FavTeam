package com.example.favteam.ui

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.favteam.Models.Team
import com.example.favteam.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.team_details.view.*
import kotlin.random.Random

class DataAdapter(private var dataset: List<Team>) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.team_details, parent, false
        )
        return ViewHolder(view)
    }

    override fun getItemCount() = dataset.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var team = dataset.get(position)

        team?.let { itemTeam ->
            holder.bind(itemTeam)
        }
        (holder.itemView as LinearLayout).setBackgroundColor(randomColor())
    }

    fun updateDataSet(updatedDataset: List<Team>) {
        dataset = updatedDataset
        notifyDataSetChanged()
    }

    private fun randomColor() = Color.rgb(
        Random.nextInt(100) + 45,
        Random.nextInt(150) + 44,
        Random.nextInt(1650) + 30
    )

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(teams: Team) {
            val teamLogoImg = teams.strTeamBadge

            teamLogoImg?.let { team_logo ->
                Picasso.get().load(team_logo).fit().into(itemView.team_logo as ImageView)
            }

            val teamStadium = teams.strStadiumThumb

            teamStadium?.let { team_Stadium ->
                Picasso.get().load(team_Stadium).fit().into(itemView.team_stadium_img as ImageView)
            }

            itemView.team_id.text = teams.idTeam
            itemView.team_name.text = teams.strTeam
            itemView.league.text = teams.strLeague
            itemView.team_alternate_name.text = teams.strAlternate
            itemView.team_stadium.text = teams.strStadium
            itemView.team_stadium_location.text = teams.strStadiumLocation
            itemView.stadium_capacity.text = teams.intStadiumCapacity
            itemView.team_description.text = teams.strDescriptionEN
        }
    }
}