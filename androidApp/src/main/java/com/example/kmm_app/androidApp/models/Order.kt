package com.example.kmm_app.androidApp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "order_info")
data class Order (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name: String,
    val description: String,
    val owner:String,
    val orderPrice: Int,
    val deliveryCharge: Int,
    val fromLocation: String,
    val toLocation: String,
    val date: String
)