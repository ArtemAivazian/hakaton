package com.example.hakaton.Service;

import com.example.hakaton.Entity.Services;
import com.example.hakaton.DataAccess.ServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j  //for logging
public class ServiceService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public void createService(Services service){
        serviceRepository.save(service);
        log.info("new service id : {}", service.getId());
    }

    public List<Services> getAllServices(){
        return serviceRepository.findAll();
    }
}

