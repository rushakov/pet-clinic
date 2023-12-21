package org.example.petclinic.services;

import org.example.petclinic.model.Owner;
import org.example.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet getById(Long id);
    Pet save(Pet pet);
    Set<Pet> getAll();
}
