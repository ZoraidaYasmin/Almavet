package com.example.Almavet.Service.impl;



import com.example.Almavet.Entity.ServiceVet;
import com.example.Almavet.Repository.ServiceRepository;
import com.example.Almavet.Service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    ServiceRepository serviceRepository;


    @Override
    public List<ServiceVet> listService() {
        return (List<ServiceVet>) this.serviceRepository.findAll();
    }

    @Override
    public ServiceVet createService(ServiceVet serviceVet) {
        serviceVet.setTypeService(serviceVet.getTypeService());
        serviceVet.setDateService(serviceVet.getDateService());
        return this.serviceRepository.save(serviceVet);
    }

    @Override
    public ServiceVet modifyService(ServiceVet serviceVet) {
        return this.serviceRepository.save(serviceVet);
    }

    @Override
    public void deleteService(int id) {
        this.serviceRepository.deleteById(id);
    }
}
