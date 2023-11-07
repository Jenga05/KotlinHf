package edu.bme.kotlin.do7dvv.recipeapp.domain

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import edu.bme.kotlin.do7dvv.recipeapp.data.entities.RecipeEntity
import edu.bme.kotlin.do7dvv.recipeapp.data.repository.RecipeRepository
import org.springframework.stereotype.Service

@Service
class RecipeService(
        private val repository: RecipeRepository,
        private val mapper: RecipeMapper) {

    fun all(): List<Recipe> {
        return mapper.toRecipeList(repository.findAll().toList())
    }

    fun get(id: Int): Recipe {
        return mapper.toRecipe(repository.findById(id).get())
    }


    fun add(recipe: Recipe): Recipe {
        return mapper.toRecipe(repository.save(mapper.toEntity(recipe)))
/*        val entity = mapper.toEntity(recipe)
        val saved = repository.save(entity)
        val updatedMaterials = entity.materials.map { mat: MaterialEntity ->
            mat.recipe = saved
            mat
        }.toList()
        entity.materials = updatedMaterials.toMutableList()
        return mapper.toRecipe(repository.save(entity))*/
    }

    fun remove(id: Int) {
        repository.deleteById(id)
    }

    fun alter(recipe: Recipe): Recipe {
        return mapper.toRecipe(repository.save(mapper.toEntity(recipe)))
    }

}