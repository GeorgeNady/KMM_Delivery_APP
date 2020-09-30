package com.example.kmm_app.androidApp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kmm_app.androidApp.R
import com.example.kmm_app.androidApp.models.Order

class OrdersList : RecyclerView.Adapter<OrdersList.OrderViewHolder>() {

    inner class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val diffUtil = object : DiffUtil.ItemCallback<Order>() {
        override fun areItemsTheSame(oldOrder: Order, newOrder: Order) = oldOrder.id == newOrder.id
        override fun areContentsTheSame(oldOrder: Order, newOrder: Order) = oldOrder == newOrder
    }

    val differ = AsyncListDiffer<Order>(this, diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        OrderViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_ticket, parent, false)
        )

    override fun getItemCount() = differ.currentList.size

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val currentItem = differ.currentList[position]
        holder.itemView.apply {

            findViewById<TextView>(R.id.tvOwner).text = currentItem.owner
            findViewById<TextView>(R.id.tvOrderAmount).text = currentItem.orderPrice.toString()
            findViewById<TextView>(R.id.tvDeliveryCharge).text =
                currentItem.deliveryCharge.toString()
            findViewById<TextView>(R.id.tvLocationFrom).text = currentItem.fromLocation
            findViewById<TextView>(R.id.tvLocationTo).text = currentItem.toLocation
            findViewById<TextView>(R.id.tvDate).text = currentItem.date.toString()

            findViewById<Button>(R.id.btnSuggestPrice).setOnClickListener {

            }

            findViewById<Button>(R.id.btnAcceptOrder).setOnClickListener {

            }

            findViewById<Button>(R.id.btnMoreInfo).setOnClickListener {

            }

        }
    }

}