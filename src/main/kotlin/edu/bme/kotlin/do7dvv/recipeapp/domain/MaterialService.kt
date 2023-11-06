package edu.bme.kotlin.do7dvv.recipeapp.domain

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import edu.bme.kotlin.do7dvv.recipeapp.data.repository.MaterialRepository
import org.springframework.stereotype.Service

@Service
class MaterialService(private val repository: MaterialRepository) {

    fun all(): List<MaterialEntity> {
        return repository.findAll().toList()
    }

    fun get(id: Int): MaterialEntity {
        return repository.findById(id).get()
    }


    fun add(material: MaterialEntity): MaterialEntity {
        return repository.save(material)
    }

    fun remove(id: Int) {
        repository.deleteById(id)
    }

    fun alter(material: MaterialEntity): MaterialEntity {
        if (material.id != null) {
            var findById: MaterialEntity = repository.findById(material.id ?: 0).get()
            findById.amount += material.amount
            return repository.save(findById)
        }
        return MaterialEntity("", 0)
    }

}