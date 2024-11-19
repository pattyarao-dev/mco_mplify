package com.mobdeve.s20.arao.patricia.mplify

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class LoginAccountFragment : Fragment(R.layout.fragment_login) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the TextView and set up click listener
        val createAccountLink = view.findViewById<TextView>(R.id.createAccountLink)
        createAccountLink.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.flFragment, CreateAccountFragment())
                addToBackStack(null) // Adds to back stack for navigation
            }
        }
    }
}