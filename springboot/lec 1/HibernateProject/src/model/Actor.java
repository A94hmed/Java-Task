package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ACTOR")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;

    public Actor() {
    }
}