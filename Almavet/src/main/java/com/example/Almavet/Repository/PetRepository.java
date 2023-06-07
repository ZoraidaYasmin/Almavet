package com.example.Almavet.Repository;

import com.example.Almavet.Entity.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet, Integer> {

    List<Pet> findAllByName(String name);
}
