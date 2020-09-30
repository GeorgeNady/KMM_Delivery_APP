package com.example.kmm_app.androidApp.repositories

import com.example.kmm_app.androidApp.db.OrdersDatabase
import com.example.kmm_app.androidApp.models.Order

class Repository(
    private val db: OrdersDatabase
) {

    suspend fun upsert(order: Order) = db.getOrdersDao().upsert(order)

    suspend fun delete(order: Order) = db.getOrdersDao().delete(order)

    fun getAllOrdersList(order: Order) = db.getOrdersDao().getAllOrdersList()

}