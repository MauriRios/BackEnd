
package com.portfolio.portfolio.interfaces;

import com.portfolio.portfolio.entitys.HardAndSoft;
import java.util.List;


public interface IHardAndSoftService {
    
        //Traer una lista de informacion
    public List<HardAndSoft> getHardAndSoft();
    
    //gardad un objeto tipo informacion de persona
    public void saveHardAndSoft(HardAndSoft hardAndSoft);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteHardAndSoft(Long id);
    
    //Buscar informacion de persona por id
    public HardAndSoft findHardAndSoft(Long id);
    
}
