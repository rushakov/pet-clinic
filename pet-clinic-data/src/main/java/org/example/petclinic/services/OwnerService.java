package org.example.petclinic.services;

import org.example.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner getByLastName(String lastName);
}
