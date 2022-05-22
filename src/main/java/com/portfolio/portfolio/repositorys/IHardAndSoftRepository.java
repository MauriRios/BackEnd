
package com.portfolio.portfolio.repositorys;

import com.portfolio.portfolio.entitys.HardAndSoft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHardAndSoftRepository extends JpaRepository<HardAndSoft, Long>{
    
}
