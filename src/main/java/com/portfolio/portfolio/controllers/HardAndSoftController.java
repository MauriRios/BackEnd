
package com.portfolio.portfolio.controllers;


import com.portfolio.portfolio.entitys.HardAndSoft;
import com.portfolio.portfolio.interfaces.IHardAndSoftService;
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
@RequestMapping  ("skill")
@CrossOrigin(origins = "*")
public class HardAndSoftController {
    
    @Autowired IHardAndSoftService ihardAndSoftService;
    
    @GetMapping("/traer")
    public List<HardAndSoft> getHardAndSoft() {
        return ihardAndSoftService.getHardAndSoft();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createHardAndSoft(@RequestBody HardAndSoft hardAndSoft) {
        ihardAndSoftService.saveHardAndSoft(hardAndSoft);
       
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteHardAndSoft(@PathVariable Long id) {
        ihardAndSoftService.deleteHardAndSoft(id);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public HardAndSoft editHardAndSoft (@PathVariable Long id,
                                        @RequestBody HardAndSoft hardAndSoft)
     { hardAndSoft.setId(id);
        ihardAndSoftService.saveHardAndSoft(hardAndSoft);
        return hardAndSoft;
    }
    
}
