package edu.bme.kotlin.do7dvv.recipeapp.data.repository

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import org.springframework.data.repository.CrudRepository
import java.util.*


interface MaterialRepository : CrudRepository<MaterialEntity, Int> {

    fun findByName(name: String): Optional<MaterialEntity>
}