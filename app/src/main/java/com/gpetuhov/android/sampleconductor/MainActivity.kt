package com.gpetuhov.android.sampleconductor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.Conductor
import kotlinx.android.synthetic.main.activity_main.*

// This is the single activity app.
// All screens (Controllers) are displayed inside the container in MainActivity.

class MainActivity : AppCompatActivity() {

    private lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Attach router to MainActivity and set home screen (HomeController)
        router = Conductor.attachRouter(this, controllerContainer, savedInstanceState)
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(HomeController()))
        }
    }

    override fun onBackPressed() {
        // Redirect back button clicks to router
        if (!router.handleBack()) {
            super.onBackPressed()
        }
    }
}
