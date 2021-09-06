package dev.ezamora.cursokotlin.openwebinar.course01.recyclerView

import android.app.Activity
import android.widget.Toast

fun Activity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    android.widget.Toast.makeText(this, text, duration).show()
}