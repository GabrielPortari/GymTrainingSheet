package com.gabrielportari.gymtrainsheet.model

class Week(
    val idWeek: Int,
    val idUser: Int,
    val description: String,
    val weekName: String,
    val weekDays: WeekDay
) {
}