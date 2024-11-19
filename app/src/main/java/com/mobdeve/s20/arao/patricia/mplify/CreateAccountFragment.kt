package com.mobdeve.s20.arao.patricia.mplify

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.commit

class CreateAccountFragment : Fragment(R.layout.fragment_create_account) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the TextView and set up click listener
        val signinLink = view.findViewById<TextView>(R.id.signinLink)
        signinLink.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.flFragment, LoginAccountFragment())
                addToBackStack(null)
            }
        }
    }
}