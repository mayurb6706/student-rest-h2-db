package com.cwm.spring_student.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class StudentDTO {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String firstname;

    @NotNull
    @Size(max = 255)
    private String lastname;

    @NotNull
    @Size(max = 255)
    @StudentEmailUnique
    private String email;

    @NotNull
    @StudentContactUnique
    private Long contact;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(final Long contact) {
        this.contact = contact;
    }

}
