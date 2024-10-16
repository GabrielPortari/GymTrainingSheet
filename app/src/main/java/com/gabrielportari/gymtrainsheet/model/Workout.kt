package com.gabrielportari.gymtrainsheet.model

class Workout(
    val idWorkout: Int,
    val idWeek: Int,
    val workoutName: String,
    val workoutDescription: String,
    val excercises: Array<Excercise>
) {
}