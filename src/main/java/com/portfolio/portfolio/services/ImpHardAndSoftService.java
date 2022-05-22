
package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.HardAndSoft;
import com.portfolio.portfolio.interfaces.IHardAndSoftService;
import com.portfolio.portfolio.repositorys.IHardAndSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHardAndSoftService implements IHardAndSoftService {
    
    @Autowired IHardAndSoftRepository ihardAndSoftRepository;
    
    @Override
    public List<HardAndSoft> getHardAndSoft() {
        List<HardAndSoft> hardAndSoft = ihardAndSoftRepository.findAll();
        return hardAndSoft;
    }

    @Override
    public void saveHardAndSoft(HardAndSoft hardAndSoft) {
        ihardAndSoftRepository.save(hardAndSoft);
        
    }

    @Override
    public void deleteHardAndSoft(Long id) {
        ihardAndSoftRepository.deleteById(id);
        
    }

    @Override
    public HardAndSoft findHardAndSoft(Long id) {
       HardAndSoft hardAndSoft = ihardAndSoftRepository.findById(id).orElse(null);
        return hardAndSoft;

    }
}
