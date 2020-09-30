package com.example.kmm_app.androidApp.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kmm_app.androidApp.R
import com.example.kmm_app.androidApp.ui.MainActivity
import com.example.kmm_app.androidApp.ui.OrderListViewModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var viewModel : OrderListViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel



    }

}