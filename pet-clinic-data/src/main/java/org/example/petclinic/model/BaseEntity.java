package org.example.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;
    public boolean isNew(){
        return this.id == null;
    }
}
