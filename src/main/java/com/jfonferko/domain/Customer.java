package com.jfonferko.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "PESEL")
    private String pesel;

    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "LASTNAME")
    private String lastname;


    public Customer() {
    }

    public Customer(final String pPesel, final String pFirstname, final String pLastname) {
        pesel = pPesel;
        firstname = pFirstname;
        lastname = pLastname;
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
        return Objects.equals(pesel, customer.pesel) &&
                Objects.equals(firstname, customer.firstname) &&
                Objects.equals(lastname, customer.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel, firstname, lastname);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "pesel='" + pesel + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
