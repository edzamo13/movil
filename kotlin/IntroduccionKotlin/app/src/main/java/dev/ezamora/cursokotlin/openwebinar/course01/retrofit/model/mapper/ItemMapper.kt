package dev.ezamora.cursokotlin.openwebinar.course01.retrofit.model.mapper

import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.model.ItemModel
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.model.dto.ItemDto

class ItemMapper {
    fun transform(items: List<ItemDto>): List<ItemModel> {
        return items.map { transform(it) }
    }

    fun transform(dto: ItemDto): ItemModel {
        return ItemModel(dto.item,
            dto.business,
            dto.farmerId,
            dto.category,
            dto.l,
            dto.farmName,
            dto.phone1)
    }
}