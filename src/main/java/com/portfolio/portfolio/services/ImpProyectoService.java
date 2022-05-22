
package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Proyecto;
import com.portfolio.portfolio.interfaces.IProyectoService;
import com.portfolio.portfolio.repositorys.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService {
    
    @Autowired IProyectoRepository iproyectoRepository;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = iproyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iproyectoRepository.save(proyecto);
        
    }

    @Override
    public void deleteProyecto(Long id) {
        iproyectoRepository.deleteById(id);
        
    }

    @Override
    public Proyecto findProyecto(Long id) {
       Proyecto persona = iproyectoRepository.findById(id).orElse(null);
        return persona;

    }
    
}
