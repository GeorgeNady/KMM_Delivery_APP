package com.example.kmm_app.androidApp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kmm_app.androidApp.models.Order

@Database(
    entities = [Order::class],
    version = 1
)
abstract class OrdersDatabase : RoomDatabase() {

    abstract fun getOrdersDao(): OrdersDao

    companion object {

        @Volatile
        private var instance: OrdersDatabase? = null

        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also {
                instance = it
            }
        }

        fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                OrdersDatabase::class.java,
                "orders_db.db"
            ).build()

    }

}