package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DOCTOR")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private double salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DOCTOR_DETAILS_ID")
    private DoctorDetails doctorDetails;

    @ManyToOne
    @JoinColumn(name = "HOSPITAL_ID")
    private Hospital hospital;

    @OneToMany
    private List<Patient> patients;

    public Doctor() {
    }

    // getters and setters
}