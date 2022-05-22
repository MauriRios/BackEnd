
package com.portfolio.portfolio.repositorys;

import com.portfolio.portfolio.entitys.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  
public interface IAcercaDeRepository extends JpaRepository<AcercaDe, Long> {
    
}
