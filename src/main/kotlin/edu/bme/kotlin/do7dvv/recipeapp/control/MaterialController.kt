package edu.bme.kotlin.do7dvv.recipeapp.control

import edu.bme.kotlin.do7dvv.recipeapp.data.entities.MaterialEntity
import edu.bme.kotlin.do7dvv.recipeapp.domain.MaterialService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/material")
class MaterialController(val service: MaterialService) {


    @GetMapping
    fun all(): List<MaterialEntity> {
        return service.all()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: Int): MaterialEntity {
        return service.get(id)
    }

    @PostMapping
    fun add(@RequestBody material: MaterialEntity): MaterialEntity {
        return service.add(material)
    }

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Int) {
        service.remove(id)
    }

    @PutMapping
    fun alter(@RequestBody material: MaterialEntity): MaterialEntity {
        return service.alter(material)
    }

}