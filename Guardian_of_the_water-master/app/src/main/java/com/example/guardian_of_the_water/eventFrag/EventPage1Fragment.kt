package com.example.guardian_of_the_water.eventFrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toolbar
import androidx.navigation.Navigation
import com.example.guardian_of_the_water.R


class EventPage1Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_event_page1, container, false)

        //TODO: Got Error for toolbar
        //val toolbar = view.findViewById<Toolbar>(R.id.toolbar)
        //toolbar.title = "Event List"

        val backBtn = view.findViewById<ImageView>(R.id.back_Btn)
        backBtn.setOnClickListener(){
            // TODO: Add back to previous page function
        }


        //val page2Btn = view.findViewById<Button>(R.id.page2Btn)
        //page2Btn.setOnClickListener()
        //{
            //Navigation.findNavController(it).navigate(R.id.action_eventPage1Fragment_to_eventPage2Fragment)
        //}
        return view
    }

}