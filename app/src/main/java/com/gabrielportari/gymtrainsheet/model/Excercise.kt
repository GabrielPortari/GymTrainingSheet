package com.gabrielportari.gymtrainsheet.model

class Excercise (
    val idExercise: Int,
    val idWorkout: Int,
    val exerciseName: String,
    val description: String,
    val qtReps: Int,
    val advancedTechnique: String?
){
}