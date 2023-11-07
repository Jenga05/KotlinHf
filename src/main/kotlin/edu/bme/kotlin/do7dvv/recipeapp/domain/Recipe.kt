package edu.bme.kotlin.do7dvv.recipeapp.domain

import jakarta.persistence.*

class Recipe(var id: Int?, var name: String, var materials: List<Material>)