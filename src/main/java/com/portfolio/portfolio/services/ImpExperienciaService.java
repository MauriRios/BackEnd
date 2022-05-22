
package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Experiencia;
import com.portfolio.portfolio.interfaces.IExperienciaService;
import com.portfolio.portfolio.repositorys.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService {
    
    @Autowired IExperienciaRepository iexperienciaRepository;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia educacion) {
        iexperienciaRepository.save(educacion);
        
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
        
    }

    @Override
    public Experiencia findExperiencia(Long id) {
       Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
        return experiencia;

    }
}
