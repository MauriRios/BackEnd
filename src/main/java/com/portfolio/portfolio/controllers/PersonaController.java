
package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Persona;
import com.portfolio.portfolio.interfaces.IPersonaService;
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
@RequestMapping  ("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/crear")
    public void createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        
    }
    
    @DeleteMapping("/borrar/{id}")
    public void deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
       
    }
    
    @PutMapping("/editar/{id}") 
    public Persona editPersona (@PathVariable Long id,
                                @RequestBody Persona persona)
     { persona.setId(id);
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/traer/perfil")
    public Persona findPersona() 
   {
       
        return ipersonaService.findPersona((long) 1);
    }
    
}


