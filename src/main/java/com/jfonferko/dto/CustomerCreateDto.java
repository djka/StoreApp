package com.jfonferko.dto;

public class CustomerCreateDto {

    private String pesel;
    private String firstname;
    private String lastname;

    public CustomerCreateDto(final String pPesel, final String pFirstname, final String pLastname) {
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
}
