package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.AcercaDe;
import com.portfolio.portfolio.interfaces.IAcercaDeService;
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
public class AcercaDeController {

    @Autowired
    IAcercaDeService iacercaDeService;

    @GetMapping("acercade/traer")
    public List<AcercaDe> getAcercaDe() {
        return iacercaDeService.getAcercaDe();
    }

    @PostMapping("acercade/crear")
    public String createAcercaDe(@RequestBody AcercaDe acercaDe) {
        iacercaDeService.saveAcercaDe(acercaDe);
        return "Creado correctamente";
    }

    @DeleteMapping("acercade/borrar/{id}")
    public String deleteAcercaDe(@PathVariable Long id) {
        iacercaDeService.deleteAcercaDe(id);
        return "Eliminado correctamente";
    }

    @PutMapping("acercade/editar/{id}")
    public AcercaDe editAcercaDe(@PathVariable Long id,
                                 @RequestParam("miInfo") String nuevoMiInfo,
                                 @RequestParam("stackInfo") String nuevoStackInfo)
 {
        AcercaDe acercaDe = iacercaDeService.findAcercaDe(id);

        acercaDe.setMiInfo(nuevoMiInfo);
        acercaDe.setStackInfo(nuevoStackInfo);

        iacercaDeService.saveAcercaDe(acercaDe);
        return acercaDe;
    }
    
        @GetMapping("acercade/traer/perfil")
    public AcercaDe findAcercaDe() {
        return iacercaDeService.findAcercaDe((long) 1);
    }
}
