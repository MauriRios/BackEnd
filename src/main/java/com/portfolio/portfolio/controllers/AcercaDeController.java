package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.AcercaDe;
import com.portfolio.portfolio.interfaces.IAcercaDeService;
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
@RequestMapping  ("acercade")
@CrossOrigin(origins = "*")
public class AcercaDeController {

    @Autowired
    IAcercaDeService iacercaDeService;

    @GetMapping("/traer")
    public List<AcercaDe> getAcercaDe() {
        return iacercaDeService.getAcercaDe();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createAcercaDe(@RequestBody AcercaDe acercaDe) {
        iacercaDeService.saveAcercaDe(acercaDe);  
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteAcercaDe(@PathVariable Long id) {
        iacercaDeService.deleteAcercaDe(id);
       
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public AcercaDe editAcercaDe(@PathVariable Long id,
                                 @RequestBody AcercaDe acercaDe)
     { acercaDe.setId(id);
        iacercaDeService.saveAcercaDe(acercaDe);
        return acercaDe;
    }
    
        @GetMapping("/traer/perfil")
    public AcercaDe findAcercaDe() {
        return iacercaDeService.findAcercaDe((long) 1);
    }
}
