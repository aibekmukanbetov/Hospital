package hospital.model;
//  Doctor классынын свойствалары: id, firstName,lastName, email, List<Patient>patients,gender

import hospital.enums.Gender;

import java.util.List;

public class Doctor {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Patient> patients;
    private Gender gender;

    public Doctor(Long id, String firstName, String lastName, String email, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }


    public Doctor(Long id, String firstName, String lastName, String email, List<Patient> patients, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.patients = patients;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", patients=" + patients +
                ", gender=" + gender +
                '}';
    }
}
