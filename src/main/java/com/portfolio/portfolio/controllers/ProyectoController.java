
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
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired IProyectoService iproyectoService;
    
    @GetMapping("proyecto/traer")
    public List<Proyecto> getPersona() {
        return iproyectoService.getProyecto();
    }
    
    @PostMapping("/proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto) {
        iproyectoService.saveProyecto(proyecto);
        return "Creado correctamente";
    }
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id) {
        iproyectoService.deleteProyecto(id);
        return  "Eliminado correctamente";
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto (@PathVariable Long id,
                                  @RequestParam("tituloProyecto") String nuevoTituloProyecto,
                                  @RequestParam("descripcionProyecto") String nuevoDescripcionProyecto)
    {
    Proyecto proyecto = iproyectoService.findProyecto(id);
        
        
    proyecto.setTituloProyecto(nuevoTituloProyecto);
    proyecto.setDescripcionProyecto(nuevoDescripcionProyecto); 

    
    iproyectoService.saveProyecto(proyecto);
    return proyecto;
    }
    
    @GetMapping("/proyecto/traer/perfil")
    public Proyecto findProyecto() {
        return iproyectoService.findProyecto((long) 1);
    }
}
