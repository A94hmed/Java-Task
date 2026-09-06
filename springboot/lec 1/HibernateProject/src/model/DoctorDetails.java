package model;

import javax.persistence.*;

@Entity
@Table(name = "DOCTOR_DETAILS")
public class DoctorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullAddress;

    private String firstName;

    private String lastName;

    private int age;

    public DoctorDetails() {
    }

    // getters and setters
}