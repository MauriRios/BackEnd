
package com.portfolio.portfolio.interfaces;

import com.portfolio.portfolio.entitys.AcercaDe;
import java.util.List;

public interface IAcercaDeService {
    
    //Traer una lista de informacion
    public List<AcercaDe> getAcercaDe();
    
    //gardad un objeto tipo informacion de persona
    public void saveAcercaDe(AcercaDe acercaDe);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteAcercaDe(Long id);
    
    //Buscar informacion de persona por id
    public AcercaDe findAcercaDe(Long id);
    
}

