package model;

import javax.persistence.*;

@Entity
@Table(name = "CLASSROOM")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;

    @ManyToOne
    @JoinColumn(name = "SCHOOL_ID")
    private School school;

    public Classroom() {
    }
}