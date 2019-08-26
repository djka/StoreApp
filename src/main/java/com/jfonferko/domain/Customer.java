package com.jfonferko.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMERID")
    private Long id;

    @Column(name = "PESEL", unique = true)
    private String pesel;

    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "ACTIVE")
    private boolean active;

    public Customer() {
    }

    public Customer(final String pPesel, final String pFirstname, final String pLastname, final boolean pActive) {
        pesel = pPesel;
        firstname = pFirstname;
        lastname = pLastname;
        active = pActive;
    }

    public Long getId() {
        return id;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public boolean isActive() {
        return active;
    }

    public void activate() {
        this.active = true;
    }

    public void deactivate() {
        this.active = false;
    }

    @Override
    public boolean equals(final Object pO) {
        if (this == pO)
        {
            return true;
        }
        if (pO == null || getClass() != pO.getClass())
        {
            return false;
        }
        Customer customer = (Customer) pO;
        return Objects.equals(id, customer.id) &&
                Objects.equals(pesel, customer.pesel) &&
                Objects.equals(firstname, customer.firstname) &&
                Objects.equals(lastname, customer.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pesel, firstname, lastname);
    }
}
