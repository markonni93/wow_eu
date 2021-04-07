package com.example.wow.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wow.R
import com.example.wow.data.AppSharedPref
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    internal lateinit var sharedPref: AppSharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        sharedPref.storeString(TOKEN, "blablabla")

    }


    companion object {
        private const val TOKEN = "token"
    }
}
