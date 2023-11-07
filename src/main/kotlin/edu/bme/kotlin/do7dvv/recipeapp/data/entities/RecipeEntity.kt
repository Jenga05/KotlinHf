package edu.bme.kotlin.do7dvv.recipeapp.data.entities

import jakarta.persistence.*

@Entity
class RecipeEntity(val name:String){

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    var id: Int? = null

    @OneToMany( cascade = [CascadeType.ALL], orphanRemoval = true)
    var materials: MutableList<MaterialEntity> = mutableListOf()
}
