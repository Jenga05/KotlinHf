package edu.bme.kotlin.do7dvv.recipeapp.domain

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import edu.bme.kotlin.do7dvv.recipeapp.data.entities.RecipeEntity
import org.mapstruct.Mapper
import org.springframework.stereotype.Component

@Component
@Mapper(componentModel = "spring")
interface RecipeMapper {

    abstract fun toRecipe(entity: RecipeEntity): Recipe

    abstract fun toEntity(recipe: Recipe): RecipeEntity

    abstract fun toRecipeList(entities: List<RecipeEntity>): List<Recipe>

    abstract fun toEntityList(recipes: List<Recipe>): List<RecipeEntity>


}