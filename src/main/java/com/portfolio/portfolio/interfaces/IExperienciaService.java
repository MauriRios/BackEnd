
package com.portfolio.portfolio.interfaces;

import com.portfolio.portfolio.entitys.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
        //Traer una lista de experiencia
    public List<Experiencia> getExperiencia();
    
    //gardad un objeto tipo experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteExperiencia(Long id);
    
    
    //Buscar una experiencia por id
    public Experiencia findExperiencia(Long id);
    
}
