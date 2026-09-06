package model;

import javax.persistence.*;

@Entity
@Table(name = "PASSPORT")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passportNumber;

    @OneToOne(mappedBy = "passport")
    private Student student;

    public Passport() {
    }
}