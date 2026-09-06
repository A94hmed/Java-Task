package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PATIENT")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String typeOfDisease;

    @ManyToMany(mappedBy = "patients")
    private List<Hospital> hospitals;

    public Patient() {
    }

    // getters and setters
}