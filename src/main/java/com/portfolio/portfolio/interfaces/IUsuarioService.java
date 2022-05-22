
package com.portfolio.portfolio.interfaces;

import com.portfolio.portfolio.entitys.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    //Traer una lista de usuarios
    public List<Usuario> getUsuario();
    
    //gardad un objeto tipo usuario
    public void saveUsuario(Usuario usuario);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteUsuario(Long id);
    
    
    //Buscar una usuario por id
    public Usuario findUsuario(Long id);


    
}
