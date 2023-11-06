package edu.bme.kotlin.do7dvv.recipeapp.control

import edu.bme.kotlin.do7dvv.recipeapp.domain.Material
import edu.bme.kotlin.do7dvv.recipeapp.domain.MaterialService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/material")
class MaterialController(val service: MaterialService) {


    fun all(): List<Material> {
        return service.all()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: Int): Material {
        return service.get(id)
    }

    @PostMapping
    fun add(@RequestBody material: Material): Material {
        return service.add(material)
    }

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Int) {
        service.remove(id)
    }

    @PutMapping
    fun alter(@RequestBody material: Material): Material {
        return service.alter(material)
    }

}