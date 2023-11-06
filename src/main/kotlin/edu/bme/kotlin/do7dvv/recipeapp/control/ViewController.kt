package edu.bme.kotlin.do7dvv.recipeapp.control

import edu.bme.kotlin.do7dvv.recipeapp.domain.MaterialService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ViewController(val service: MaterialService)  {


    @GetMapping("/materials")
    fun showList(model: Model): String{
        val materials = service.all()
        model.addAttribute("materials",materials)
        return "materials"
    }


}