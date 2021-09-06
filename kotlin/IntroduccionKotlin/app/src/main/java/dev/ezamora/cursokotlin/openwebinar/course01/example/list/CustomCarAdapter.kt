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

class CustomCarAdapter(val items: List<CarModel>, val listener: CustomListener)
    : RecyclerView.Adapter<CustomCarAdapter.CarViewHolder>() {

    interface CustomListener {
        fun clickOnCarItem(carModel: CarModel)
        fun longClickOnCarItem(carModel: CarModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.row_car, parent, false))
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = items.get(position)
        holder.brandLabel.text = car.brand
        holder.check.isChecked = car.isSelected
        holder.itemView.setOnClickListener {
            holder.check.performClick()
        }

        holder.itemView.setOnLongClickListener {
            listener.longClickOnCarItem(car)
            true
        }

        holder.check.setOnCheckedChangeListener { _, isChecked ->
            car.isSelected = isChecked
            listener.clickOnCarItem(car)
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