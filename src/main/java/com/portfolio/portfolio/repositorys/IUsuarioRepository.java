
package com.portfolio.portfolio.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolio.entitys.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
     
}
