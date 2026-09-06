package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DOCTOR")
public class Doctor2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private double salary;

    @ManyToMany
    @JoinTable(
        name = "DOCTOR_PATIENT",
        joinColumns = @JoinColumn(name = "DOCTOR_ID"),
        inverseJoinColumns = @JoinColumn(name = "PATIENT_ID")
    )
    private List<Patient> patients;

    public Doctor2() {
    }
}