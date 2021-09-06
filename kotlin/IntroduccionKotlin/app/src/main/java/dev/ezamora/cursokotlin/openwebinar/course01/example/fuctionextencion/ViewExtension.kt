package dev.ezamora.cursokotlin.openwebinar.course01.example.fuctionextencion



import android.annotation.SuppressLint
import android.text.TextUtils
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


fun View.isVisible() : Boolean {
    return this.visibility == View.VISIBLE
}

fun TextView.setTextAndHideViewIfIsNeeded(text: String) {
    if (!TextUtils.isEmpty(text)) {
        this.text = text
        this.visibility = View.VISIBLE
    } else {
        this.text = ""
        this.visibility = View.GONE
    }
}

@SuppressLint("ResourceType")
fun ImageView.loadUrl(url: String) {
    Picasso.with(this.context).load(url).into(this)

}

fun RecyclerView.setUp(layoutManager: RecyclerView.LayoutManager,
                       adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) {
    this.layoutManager = layoutManager
    this.adapter = adapter
}