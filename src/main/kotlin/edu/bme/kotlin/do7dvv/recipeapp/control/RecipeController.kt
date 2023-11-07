package edu.bme.kotlin.do7dvv.recipeapp.control

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.RecipeEntity
import edu.bme.kotlin.do7dvv.recipeapp.data.repository.RecipeRepository
import edu.bme.kotlin.do7dvv.recipeapp.domain.Material
import edu.bme.kotlin.do7dvv.recipeapp.domain.MaterialService
import edu.bme.kotlin.do7dvv.recipeapp.domain.Recipe
import edu.bme.kotlin.do7dvv.recipeapp.domain.RecipeService
import org.springframework.core.annotation.Order
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/recipe")
class RecipeController(val service: RecipeService) {


    @GetMapping
    fun all(): List<Recipe> {
        return service.all()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: Int): Recipe {
        return service.get(id)
    }

    @PostMapping
    fun add(@RequestBody recipe: Recipe): Recipe {
        return service.add(recipe)
    }

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Int) {
        service.remove(id)
    }

    @PutMapping
    fun alter(@RequestBody material: Recipe): Recipe {
        return service.alter(material)
    }

}