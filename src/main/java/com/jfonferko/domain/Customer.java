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
    private Long id;

    @Column(name = "PESEL", unique = true)
    private String pesel;

    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "LASTNAME")
    private String lastname;


    public Customer() {
    }

    public Customer(final String pPesel, final String pFirstname, final String pLastname) {
        this.id = id;
        this.pesel = pPesel;
        this.firstname = pFirstname;
        this.lastname = pLastname;
    }

    Customer(final Long id, final String pPesel, final String pFirstname, final String pLastname) {
        this(pPesel, pFirstname, pLastname);
        this.id = id;

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
