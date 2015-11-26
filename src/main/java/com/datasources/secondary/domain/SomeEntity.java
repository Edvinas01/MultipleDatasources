package com.datasources.secondary.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SomeEntity {

    @Id
    @GeneratedValue
    private long id;

    private String someDifferentValue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSomeDifferentValue() {
        return someDifferentValue;
    }

    public void setSomeDifferentValue(String someDifferentValue) {
        this.someDifferentValue = someDifferentValue;
    }
}