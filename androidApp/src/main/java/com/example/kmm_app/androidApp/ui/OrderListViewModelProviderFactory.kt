package com.example.kmm_app.androidApp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kmm_app.androidApp.repositories.Repository

@Suppress("UNCHECKED_CAST")
class OrderListViewModelProviderFactory (
    val repository: Repository
) : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return OrderListViewModel(repository) as T
    }
}