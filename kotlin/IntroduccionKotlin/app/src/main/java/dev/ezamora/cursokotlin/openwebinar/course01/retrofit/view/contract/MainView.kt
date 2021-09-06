package dev.ezamora.cursokotlin.openwebinar.course01.retrofit.view.contract

import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.model.ItemModel

interface MainView {
    fun setDataSet(items: List<ItemModel>)
}