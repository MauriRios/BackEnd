
package com.portfolio.portfolio.interfaces;

import com.portfolio.portfolio.entitys.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    //Traer una lista de informacion
    public List<Proyecto> getProyecto();
    
    //gardad un objeto tipo informacion de Proyecto
    public void saveProyecto(Proyecto proyecto);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteProyecto(Long id);
    
    //Buscar informacion de persona por id
    public Proyecto findProyecto(Long id);
    
}
