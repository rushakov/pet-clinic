package org.example.petclinic.model;

public class PetType extends BaseEntity{
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
