package dev.ezamora.cursokotlin.openwebinar.course01.recyclerView


import android.text.TextUtils
import android.widget.TextView

fun TextView.setTextDefault(text: String) {
    if (!TextUtils.isEmpty(text)) {
        this.text = text
    } else {
        this.text = "Id no válido"
    }
}