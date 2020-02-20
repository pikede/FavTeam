package com.example.favteam.ui


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.favteam.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.team_details.*
import kotlinx.android.synthetic.main.team_details.view.*

/**
 * A simple [Fragment] subclass.
 */
class TeamDetailFragment : Fragment() {

    private var team_name: String = ""
    private var teamStadiumUri: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey("team_name")) {
                teamStadiumUri = getArguments()?.getString("imageUri") ?: "imageUri"
                Log.d("image:::", teamStadiumUri)
                team_name = getArguments()?.getString("team_name") ?: "team_name"

            }
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView: View = inflater.inflate(R.layout.team_details,
            container, false)

        team_name?.let { teamname -> rootView.team_name.text = "Team Name: " + teamname }

//        teamStadiumUri?.let { image ->
//            Picasso.get().load(teamStadiumUri).fit().into(team_stadium_img as ImageView)
//        }

        return rootView
    }


}

