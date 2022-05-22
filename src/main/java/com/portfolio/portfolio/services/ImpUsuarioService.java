package com.portfolio.portfolio.services;


import com.portfolio.portfolio.entitys.Usuario;
import com.portfolio.portfolio.interfaces.IUsuarioService;
import com.portfolio.portfolio.repositorys.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUsuarioService implements IUsuarioService {

    @Autowired
    IUsuarioRepository iusuarioRepository;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuario = iusuarioRepository.findAll();
        return usuario;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        iusuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        iusuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = iusuarioRepository.findById(id).orElse(null);
        return usuario;
    }

}
