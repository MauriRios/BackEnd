
package com.portfolio.portfolio.interfaces;

import com.portfolio.portfolio.entitys.Educacion;
import java.util.List;

public interface IEducacionService {
        
    //Traer una lista de educacion
    public List<Educacion> getEducacion();
    
    //gardad un objeto tipo informacion de educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteEducacion(Long id);
    
    //Buscar educacion por id
    public Educacion findEducacion(Long id);

    
}
