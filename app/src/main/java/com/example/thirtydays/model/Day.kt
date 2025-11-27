package com.example.thirtydays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydays.R

data class Day private constructor(@StringRes val dayTitle: Int, @StringRes val dayDescription: Int, val dayNumber: Int, @DrawableRes val dayImage: Int){
    companion object{
        private var countDay: Int = 0
        fun create(@StringRes dayTitle: Int, @StringRes dayDescription: Int, @DrawableRes dayImage: Int): Day{
            countDay++
            return Day(dayTitle, dayDescription, countDay, dayImage)
        }
    }
}

val days = listOf(
    Day.create(dayTitle = R.string.dia1_titulo, dayDescription = R.string.dia1_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia2_titulo, dayDescription = R.string.dia2_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia3_titulo, dayDescription = R.string.dia3_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia4_titulo, dayDescription = R.string.dia4_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia5_titulo, dayDescription = R.string.dia5_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia6_titulo, dayDescription = R.string.dia6_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia7_titulo, dayDescription = R.string.dia7_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia8_titulo, dayDescription = R.string.dia8_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia9_titulo, dayDescription = R.string.dia9_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia10_titulo, dayDescription = R.string.dia10_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia11_titulo, dayDescription = R.string.dia11_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia12_titulo, dayDescription = R.string.dia12_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia13_titulo, dayDescription = R.string.dia13_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia14_titulo, dayDescription = R.string.dia14_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia15_titulo, dayDescription = R.string.dia15_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia16_titulo, dayDescription = R.string.dia16_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia17_titulo, dayDescription = R.string.dia17_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia18_titulo, dayDescription = R.string.dia18_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia19_titulo, dayDescription = R.string.dia19_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia20_titulo, dayDescription = R.string.dia20_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia21_titulo, dayDescription = R.string.dia21_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia22_titulo, dayDescription = R.string.dia22_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia23_titulo, dayDescription = R.string.dia23_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia24_titulo, dayDescription = R.string.dia24_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia25_titulo, dayDescription = R.string.dia25_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia26_titulo, dayDescription = R.string.dia26_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia27_titulo, dayDescription = R.string.dia27_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia28_titulo, dayDescription = R.string.dia28_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia29_titulo, dayDescription = R.string.dia29_descricao, dayImage = R.drawable.typing_on_a_pc),
    Day.create(dayTitle = R.string.dia30_titulo, dayDescription = R.string.dia30_descricao, dayImage = R.drawable.typing_on_a_pc)
)