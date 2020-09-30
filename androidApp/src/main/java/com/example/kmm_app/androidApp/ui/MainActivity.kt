package com.example.kmm_app.androidApp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.kmm_app.androidApp.R
import com.example.kmm_app.androidApp.db.OrdersDatabase
import com.example.kmm_app.androidApp.repositories.Repository
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView : BottomNavigationView
    private lateinit var navHostFragment : FragmentContainerView

    lateinit var viewModel: OrderListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        navHostFragment = findViewById(R.id.nav_host_fragment)

        val db = OrdersDatabase(this)
        val repository = Repository(db)
        val factory = OrderListViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(OrderListViewModel::class.java)
    
        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())

    }

}
