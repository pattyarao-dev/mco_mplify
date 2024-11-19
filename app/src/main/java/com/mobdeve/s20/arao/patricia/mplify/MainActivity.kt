package com.mobdeve.s20.arao.patricia.mplify

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val createAccount = CreateAccountFragment()
//        val loginAccount = LoginAccountFragment()

        if (savedInstanceState == null){
            replaceFragment(LoginAccountFragment())
        }


        val mplifyTitle = findViewById<TextView>(R.id.mplifyTitle)
        val gradient = mplifyTitle.paint
        val width = gradient.measureText(mplifyTitle.text.toString())
        mplifyTitle.paint.shader = LinearGradient(
            0f,0f, width, mplifyTitle.textSize, intArrayOf(
                Color.parseColor("#0FA3B1"),
                Color.parseColor("#F7A072")
            ), null, Shader.TileMode.REPEAT
        )
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
    }
}