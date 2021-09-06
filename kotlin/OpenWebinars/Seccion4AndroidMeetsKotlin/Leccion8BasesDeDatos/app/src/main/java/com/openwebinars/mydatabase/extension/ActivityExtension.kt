package com.openwebinars.mydatabase.extension

import android.app.Activity
import android.widget.Toast

fun Activity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}