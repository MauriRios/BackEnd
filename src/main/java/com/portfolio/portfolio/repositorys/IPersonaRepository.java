
package com.portfolio.portfolio.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolio.entitys.Persona;
import org.springframework.stereotype.Repository;

@Repository  
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
        
        
    

