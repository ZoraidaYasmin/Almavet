package com.example.Almavet.Service;

import com.example.Almavet.Entity.Pet;

import java.util.List;

public interface PetService {

    public List<Pet> listPet();

    public Pet createPet(Pet pet);

    public Pet modifyPet(Pet pet);

    public List<Pet> findPet(String name);

    public void deletePet(int id);
}
