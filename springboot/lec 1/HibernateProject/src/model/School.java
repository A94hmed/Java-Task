package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SCHOOL")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "school")
    private List<Classroom> classrooms;

    public School() {
    }
}