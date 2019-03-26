package com.gpetuhov.android.sampleconductor

import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.bluelinelabs.conductor.Controller

class HomeController : Controller() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.controller_home, container, false)
    }

}
