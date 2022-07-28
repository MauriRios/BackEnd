
package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Educacion;
import com.portfolio.portfolio.interfaces.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@CrossOrigin(origins = "*")
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
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("crear")
    public void createEduacion(@RequestBody Educacion educacion) {
        ieducacionService.saveEducacion(educacion);       
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("borrar/{id}")
    public void deleteEducacion(@PathVariable("id") Long id) {
        ieducacionService.deleteEducacion(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("editar/{id}")
    public Educacion editEducacion (@PathVariable("id") Long id,
                                   @RequestBody Educacion educacion)
    {
    
    educacion.setId(id);  
    ieducacionService.saveEducacion(educacion);
    
    return educacion;
    }
    
}
