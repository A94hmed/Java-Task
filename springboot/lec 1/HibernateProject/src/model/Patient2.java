package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PATIENT")
public class Patient2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String typeOfDisease;

    @ManyToMany(mappedBy = "patients")
    private List<Doctor> doctors;

    public Patient2() {
    }
}