package com.example.Almavet.Repository;

import com.example.Almavet.Entity.ServiceVet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<ServiceVet, Integer> {
}
