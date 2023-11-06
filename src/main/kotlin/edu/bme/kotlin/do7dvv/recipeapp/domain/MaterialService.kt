package edu.bme.kotlin.do7dvv.recipeapp.domain

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import edu.bme.kotlin.do7dvv.recipeapp.data.repository.MaterialRepository
import org.springframework.stereotype.Service

@Service
class MaterialService(
        private val repository: MaterialRepository,
        private val mapper: MaterialMapper) {

    fun all(): List<Material> {
        return mapper.toMaterialList(repository.findAll().toList())
    }

    fun get(id: Int): Material {
        return mapper.toMaterial(repository.findById(id).get())
    }


    fun add(material: Material): Material {
        return mapper.toMaterial(repository.save(mapper.toEntity(material)))
    }

    fun remove(id: Int) {
        repository.deleteById(id)
    }

    fun alter(material: Material): Material {
        if (material.id != null) {
            var findById: MaterialEntity = repository.findById(material.id ?: 0).get()
            findById.amount += material.amount
            return mapper.toMaterial(repository.save(findById))
        }
        return Material(-1,"", 0)
    }

}