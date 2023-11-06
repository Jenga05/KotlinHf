package edu.bme.kotlin.do7dvv.recipeapp.data.repository

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import org.springframework.data.repository.CrudRepository


interface MaterialRepository : CrudRepository<MaterialEntity, Int> {

}