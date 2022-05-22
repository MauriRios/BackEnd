
package com.portfolio.portfolio.controllers;


import com.portfolio.portfolio.entitys.HardAndSoft;
import com.portfolio.portfolio.interfaces.IHardAndSoftService;
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
public class HardAndSoftController {
    
    @Autowired IHardAndSoftService ihardAndSoftService;
    
    @GetMapping("skill/traer")
    public List<HardAndSoft> getHardAndSoft() {
        return ihardAndSoftService.getHardAndSoft();
    }
    
    @PostMapping("/skill/crear")
    public String createHardAndSoft(@RequestBody HardAndSoft hardAndSoft) {
        ihardAndSoftService.saveHardAndSoft(hardAndSoft);
        return "Creado correctamente";
    }
    
    @DeleteMapping("/skill/borrar/{id}")
    public String deleteHardAndSoft(@PathVariable Long id) {
        ihardAndSoftService.deleteHardAndSoft(id);
        return  "Eliminado correctamente";
    }
    
    @PutMapping("/skill/editar/{id}")
    public HardAndSoft editHardAndSoft (@PathVariable Long id,
                                        @RequestParam("skill") String nuevoSkill,
                                        @RequestParam("skillBar") String nuevoSkillBar)
    {
    HardAndSoft hardAndSoft = ihardAndSoftService.findHardAndSoft(id);
        
        
    hardAndSoft.setSkill(nuevoSkill);
    hardAndSoft.setSkillbar(nuevoSkillBar);

    
    ihardAndSoftService.saveHardAndSoft(hardAndSoft);
    return hardAndSoft;
    }
    
    @GetMapping("/skill/traer/perfil")
    public HardAndSoft findHardAndSoft() {
        return ihardAndSoftService.findHardAndSoft((long) 1);
    }
    
}
