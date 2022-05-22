package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Usuario;
import com.portfolio.portfolio.interfaces.IUsuarioService;
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
public class UsuarioController {

    @Autowired
    IUsuarioService iusuarioService;

    @GetMapping("usuarios/traer")
    public List<Usuario> getUsuario() {
        return iusuarioService.getUsuario();
    }

    @PostMapping("usuarios/crear")
    public String createUsuario(@RequestBody Usuario user) {
        iusuarioService.saveUsuario(user);
        return "Usuario creado";
    }

    @DeleteMapping("usuarios/borrar/{id}")
    public String deleteUsuario(@PathVariable Long id) {
        iusuarioService.deleteUsuario(id);
        return "Usuario BORRADO";
    }

    @PutMapping("/usuarios/editar/{id}")
    public Usuario editUsuario(@PathVariable Long id,
                               @RequestParam("user") String nuevoUser,
                               @RequestParam("password") String nuevoPassword)
    {
        Usuario user = iusuarioService.findUsuario(id);
        
        user.setUser(nuevoUser);
        user.setPassword(nuevoPassword);
        
        iusuarioService.saveUsuario(user);
        return user;
    }
}
