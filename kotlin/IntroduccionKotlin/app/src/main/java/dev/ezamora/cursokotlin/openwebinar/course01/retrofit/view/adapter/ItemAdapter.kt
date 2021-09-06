package dev.ezamora.cursokotlin.openwebinar.course01.retrofit.view.adapter

import android.os.Parcel
import android.os.Parcelable


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.ezamora.cursokotlin.R
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.model.ItemModel
import kotlinx.android.synthetic.main.row_item.view.*


class ItemAdapter(private val items: List<ItemModel>, private val listener: (ItemModel) -> Unit)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(), Parcelable {

    constructor(parcel: Parcel) : this(
        TODO("items"),
        TODO("listener")
    ) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.row_item, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items.get(position) //- También se puede usar items[position]
        holder.itemId.text = item.farmerId
        holder.itemName.text = item.farmName
        holder.itemView.setOnClickListener {
            listener(item)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemId = itemView.rowItemId
        val itemName = itemView.rowItemName
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemAdapter> {
        override fun createFromParcel(parcel: Parcel): ItemAdapter {
            return ItemAdapter(parcel)
        }

        override fun newArray(size: Int): Array<ItemAdapter?> {
            return arrayOfNulls(size)
        }
    }
}