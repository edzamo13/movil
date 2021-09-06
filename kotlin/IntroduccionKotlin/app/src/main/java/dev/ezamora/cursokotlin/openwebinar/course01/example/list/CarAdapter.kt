package dev.ezamora.cursokotlin.openwebinar.course01.example.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.ezamora.cursokotlin.R
import dev.ezamora.cursokotlin.openwebinar.course01.model.CarModel
import kotlinx.android.synthetic.main.row_car.view.*
import kotlinx.android.synthetic.main.row_car.view.rowCarBrandLabel
import kotlinx.android.synthetic.main.row_car_example.view.*


class CarAdapter(val items: List<CarModel>, val listener: (CarModel) -> Unit)
: RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.row_car_example, parent, false))
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = items.get(position)
        holder.brandLabel.text = car.brand
        holder.check.isChecked = car.isSelected
        holder.itemView.setOnClickListener {
            holder.check.performClick()
        }
        holder.check.setOnCheckedChangeListener { _, isChecked ->
            car.isSelected = isChecked
            listener(car)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val brandLabel = itemView.rowCarBrandLabel
        val check = itemView.rowCarSwitch
    }
}
