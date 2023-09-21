package com.example.hakaton.Services;

import com.example.hakaton.Objects.Items;
import com.example.hakaton.Objects.Services;
import com.example.hakaton.Repositories.ItemRepository;
import com.example.hakaton.Repositories.ServiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public void createService(Services service){
        serviceRepository.save(service);
        log.info("new service id : {}", service.getId());
    }

    public List<Services> getAllServices(){
        return serviceRepository.findAll();
    }
}

