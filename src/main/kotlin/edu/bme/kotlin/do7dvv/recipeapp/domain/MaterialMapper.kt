package edu.bme.kotlin.do7dvv.recipeapp.domain

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface MaterialMapper {

    abstract fun toMaterial(entity: MaterialEntity): Material

    abstract fun toEntity(material: Material): MaterialEntity

    abstract fun toMaterialList(entities: List<MaterialEntity>): List<Material>

    abstract fun toEntityList(material: List<Material>): List<MaterialEntity>


}