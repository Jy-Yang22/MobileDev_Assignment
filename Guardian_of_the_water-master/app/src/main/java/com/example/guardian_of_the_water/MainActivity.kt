package com.example.guardian_of_the_water

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.guardian_of_the_water.databinding.ActivityMainBinding
import com.example.guardian_of_the_water.donationFrag.DonationFragmentPage1


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val eventBtn = findViewById<Button>(R.id.toEventBtn)

        //View.findNavController()

        eventBtn.setOnClickListener()
        {
            //nav.navigate(R.id.action_staterFragment_to_eventPage1Fragment)
        }


    }
}