package com.gpetuhov.android.sampleconductor

import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.RouterTransaction

// Controllers are like Fragments.
// When using Conductor library, we have to use Controllers instead of Fragments.

class HomeController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_home, container, false)

        val navigateButton = view.findViewById<Button>(R.id.navigateButton)
        navigateButton.setOnClickListener { navigate() }

        return view
    }

    // This is how we navigate to second screen
    private fun navigate() = router.pushController(RouterTransaction.with(SecondController()))
}
