package org.example.petclinic.services;

import org.example.petclinic.model.Owner;
import org.example.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet getById(Long id);
    Vet save(Vet vet);
    Set<Vet> getAll();
}
