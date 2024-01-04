package org.example.petclinic.bootstrap;

import org.example.petclinic.map.OwnerServiceMap;
import org.example.petclinic.map.VetServiceMap;
import org.example.petclinic.model.Owner;
import org.example.petclinic.model.Vet;
import org.example.petclinic.services.OwnerService;
import org.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Ivan");
        owner1.setLastName("Ivanov");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setFirstName("Petr");
        owner2.setLastName("Petrov");
        ownerService.save(owner2);
        System.out.println("Owners saved");

        Vet vet1 = new Vet();
        vet1.setFirstName("Semen");
        vet1.setLastName("Semenov");
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setFirstName("Sidor");
        vet2.setLastName("Sidorov");
        vetService.save(vet2);
        System.out.println("Vets saved");

    }
}
