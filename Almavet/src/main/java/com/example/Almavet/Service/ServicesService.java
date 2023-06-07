package com.example.Almavet.Service;

import com.example.Almavet.Entity.ServiceVet;

import java.util.List;

public interface ServicesService {

    public List<ServiceVet> listService();

    public ServiceVet createService(ServiceVet serviceVet);

    public ServiceVet modifyService(ServiceVet serviceVet);

    public void deleteService(int id);
}
