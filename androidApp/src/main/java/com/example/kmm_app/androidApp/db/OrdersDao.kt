package com.example.kmm_app.androidApp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.kmm_app.androidApp.models.Order

@Dao
interface OrdersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(order: Order)

    @Delete
    suspend fun delete(order: Order)

    @Query("SELECT * FROM order_info")
    fun getAllOrdersList() : LiveData<List<Order>>

}