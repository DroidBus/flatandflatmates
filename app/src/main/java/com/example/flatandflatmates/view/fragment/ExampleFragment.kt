package com.example.flatandflatmates.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import com.example.flatandflatmates.R
import com.example.flatandflatmates.view.activity.ProfileActivity


class ExampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = ComposeView(requireContext())
        view.apply {
            setContent {
                val context = LocalContext.current
                Button(onClick = {
                    val intent = Intent(context, ProfileActivity::class.java)
                    startActivity(intent)
                }, modifier = Modifier.wrapContentSize()) {
                     Text("Go to Profile Page")
                }
            }
        }
        return view
    }

}