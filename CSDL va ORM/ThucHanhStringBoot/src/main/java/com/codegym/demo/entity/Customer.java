package com.codegym.demo.entity;
import javax.persistence.*;

@Entity
@Table(name= "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String fistName;
    private String lastName;

    public Customer() {
    }

    public Customer( String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
