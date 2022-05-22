
package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.AcercaDe;
import com.portfolio.portfolio.interfaces.IAcercaDeService;
import com.portfolio.portfolio.repositorys.IAcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpAcercaDeService implements IAcercaDeService {

    @Autowired IAcercaDeRepository iacercaDeRepository;
    
    @Override
    public List<AcercaDe> getAcercaDe() {
        List<AcercaDe> acercaDe = iacercaDeRepository.findAll();
        return acercaDe;
    }

    @Override
    public void saveAcercaDe(AcercaDe acercaDe) {
        iacercaDeRepository.save(acercaDe);
        
    }

    @Override
    public void deleteAcercaDe(Long id) {
        iacercaDeRepository.deleteById(id);
        
    }

    @Override
    public AcercaDe findAcercaDe(Long id) {
       AcercaDe acercaDe = iacercaDeRepository.findById(id).orElse(null);
        return acercaDe;

    }
    
}
