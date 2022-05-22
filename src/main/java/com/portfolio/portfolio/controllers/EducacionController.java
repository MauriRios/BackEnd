
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("educacion/traer")
    public List<Educacion> getEducacion() {
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("educacacion/crear")
    public String createEduacion(@RequestBody Educacion educacion) {
        ieducacionService.saveEducacion(educacion);
        return "Creado correctamente";
    }
    
    @DeleteMapping("educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        ieducacionService.deleteEducacion(id);
        return  "Eliminado correctamente";
    }
    
    @PutMapping("educacion/editar/{id}")
    public Educacion editEducacion (@PathVariable Long id,
                                    @RequestParam("institucion") String nuevoInstitucion,
                                    @RequestParam("titulo") String nuevoTitulo,
                                    @RequestParam("periodoEstudio") String nuevoPeriodoEstudio,
                                    @RequestParam("img") String nuevoImg) {
    Educacion educacion = ieducacionService.findEducacion(id);
        
        
    educacion.setInstitucion(nuevoInstitucion);
    educacion.setTitulo(nuevoTitulo); 
    educacion.setPeriodoEstudio(nuevoPeriodoEstudio);
    educacion.setImg(nuevoImg);
    
    ieducacionService.saveEducacion(educacion);
    return educacion;
    }
    
    @GetMapping("educacion/traer/perfil")
    public Educacion findEducacion() {
        return ieducacionService.findEducacion((long) 1);
    }
}
