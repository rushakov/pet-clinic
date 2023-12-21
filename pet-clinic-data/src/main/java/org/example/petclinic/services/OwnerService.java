package org.example.petclinic.services;

import org.example.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner getByLastName(String lastName);
    Owner getById(Long id);
    Owner save(Owner owner);
    Set<Owner> getAll();


}
