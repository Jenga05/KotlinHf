package edu.bme.kotlin.do7dvv.recipeapp.data.repository

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import edu.bme.kotlin.do7dvv.recipeapp.data.entities.RecipeEntity
import org.springframework.data.repository.CrudRepository


interface RecipeRepository : CrudRepository<RecipeEntity, Int>