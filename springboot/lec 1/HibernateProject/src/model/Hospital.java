package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "HOSPITAL")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int numberOfDoctors;

    private int numberOfPatient;

    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctors;

    @ManyToMany
    @JoinTable(
        name = "HOSPITAL_PATIENT",
        joinColumns = @JoinColumn(name = "HOSPITAL_ID"),
        inverseJoinColumns = @JoinColumn(name = "PATIENT_ID")
    )
    private List<Patient> patients;

    public Hospital() {
    }

    // getters and setters
}