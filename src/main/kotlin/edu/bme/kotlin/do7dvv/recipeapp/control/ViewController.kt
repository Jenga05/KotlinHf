package edu.bme.kotlin.do7dvv.recipeapp.control

import edu.bme.kotlin.do7dvv.recipeapp.domain.Material
import edu.bme.kotlin.do7dvv.recipeapp.domain.MaterialMapper
import edu.bme.kotlin.do7dvv.recipeapp.domain.MaterialService
import edu.bme.kotlin.do7dvv.recipeapp.domain.form.CreateMaterial
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ViewController(val service: MaterialService, val mapper:MaterialMapper)  {

    val listRedirect = "redirect:/materials"

    @GetMapping("/materials")
    fun showList(model: Model): String{
        val materials = service.all()
        model.addAttribute("materials",materials)
        return "materials"
    }

    @GetMapping("/add-material")
    fun addMat(model: Model): String{
        model.addAttribute("material",CreateMaterial())
        return "add-material"
    }

    @PostMapping("/add-material")
    fun addMatPost(mat: CreateMaterial, model: Model): String{
        val material = mapper.toMaterial(mat)
        val byName = service.byName(material.name)
        if (byName == null) service.add(material)
        else {
            material.id = byName.id
            service.alter(material)
        }

        return listRedirect
    }

    @GetMapping("/material/delete/{id}")
    fun deleteMaterial(@PathVariable id:Int?): String{
        if (id == null) return listRedirect
        service.remove(id)
        return listRedirect
    }

}