
package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Educacion;
import com.portfolio.portfolio.interfaces.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping ("educacion/")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("traer")
    public List<Educacion> getEducacion() {
        return ieducacionService.getEducacion();
    }
    @GetMapping("/{id}")
    public Educacion findEducacion(@PathVariable("id") Long id){
        return ieducacionService.findEducacion(id);
    }    
    
    @PostMapping("crear")
    public void createEduacion(@RequestBody Educacion educacion) {
        ieducacionService.saveEducacion(educacion);       
    }
    
    @DeleteMapping("borrar/{id}")
    public void deleteEducacion(@PathVariable("id") Long id) {
        ieducacionService.deleteEducacion(id);
    }
    
    @PutMapping("editar/{id}")
    public Educacion editEducacion (@PathVariable("id") Long id,
                                   @RequestBody Educacion educacion)
    {
    
    educacion.setId(id);  
    ieducacionService.saveEducacion(educacion);
    
    return educacion;
    }
    
    @GetMapping("traer/perfil")
    public Educacion findEducacion() {
        return ieducacionService.findEducacion((long) 1);
    }
}
