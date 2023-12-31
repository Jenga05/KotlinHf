package edu.bme.kotlin.do7dvv.recipeapp.data.entities

import jakarta.persistence.*

@Entity
data class MaterialEntity(val name:String, var amount:Int){

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    var id: Int? = null

/*    @ManyToOne
    @JoinColumn
    var recipe: RecipeEntity? = null*/

}
