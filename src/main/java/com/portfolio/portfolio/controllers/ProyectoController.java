
package com.portfolio.portfolio.controllers;


import com.portfolio.portfolio.entitys.Proyecto;
import com.portfolio.portfolio.interfaces.IProyectoService;
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
@CrossOrigin(origins = "*")
public class ProyectoController {
    
    @Autowired IProyectoService iproyectoService;
    
    @GetMapping("proyecto/traer")
    public List<Proyecto> getPersona() {
        return iproyectoService.getProyecto();
    }
    
    @PostMapping("/proyecto/crear")
    public void createProyecto(@RequestBody Proyecto proyecto) {
        iproyectoService.saveProyecto(proyecto);
        
    }
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public void deleteProyecto(@PathVariable Long id) {
        iproyectoService.deleteProyecto(id);
        
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto (@PathVariable("id") Long id,
                                        @RequestBody Proyecto proyecto)
    {
    proyecto.setId(id);  
    iproyectoService.saveProyecto(proyecto);
    
    return proyecto;
    }

}
