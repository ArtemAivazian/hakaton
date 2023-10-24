package com.example.hakaton.service;

import com.example.hakaton.entity.Services;
import com.example.hakaton.DAO.ServiceRepository;
import com.example.hakaton.exeption.ApiRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j  //for logging
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public void createService(Services service){
        var serviceOptional = serviceRepository.findByDateAndTime(service.getDate(), service.getTime());
        if (serviceOptional.isPresent()) {
            throw new ApiRequestException("There is already a service for this date");
        }
        serviceRepository.save(service);
        log.info("new service id : {}", service.getId());
    }

    public void deleteService(UUID serviceId) {
        var serviceOptional = serviceRepository.findById(serviceId);
        if (serviceOptional.isPresent()) {
            serviceRepository.deleteById(serviceId);
            log.info("Deleted service with id: {}", serviceId);
        } else {
            throw new ApiRequestException("Service not found for deletion");
        }
    }

    public List<Services> getAllServices(){
        return serviceRepository.findAll();
    }
}

