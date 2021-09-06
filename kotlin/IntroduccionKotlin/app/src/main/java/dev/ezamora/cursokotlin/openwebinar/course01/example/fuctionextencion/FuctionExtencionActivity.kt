package dev.ezamora.cursokotlin.openwebinar.course01.example.fuctionextencion

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dev.ezamora.cursokotlin.R

class FuctionExtencionActivity : AppCompatActivity() {

    var titleLabel: Lazy<TextView> = bindView(R.id.main__title_label)
    var btn: Lazy<Button> = bindView(R.id.main__btn)
    var image: Lazy<ImageView> = bindView(R.id.main__icon)

    var titleLabelList: List<Lazy<TextView>> = bindViews(
        intArrayOf(R.id.main__label_to_hide1,
            R.id.main__label_to_hide2))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fuction_extencion)
        image.value.loadUrl("https://www.linuxadictos.com/wp-content/uploads/openwebinars-logo.jpg")

        titleLabel.value.isVisible()
        titleLabel.value.setTextAndHideViewIfIsNeeded("")
        titleLabel.value.isVisible()

        btn.value.setOnClickListener {
            titleLabelList.map {
                it.value.visibility = View.GONE
            }
        }
    }




}