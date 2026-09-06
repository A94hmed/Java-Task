package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "MOVIE_ACTOR",
        joinColumns = @JoinColumn(name = "MOVIE_ID"),
        inverseJoinColumns = @JoinColumn(name = "ACTOR_ID")
    )
    private List<Actor> actors;

    public Movie() {
    }
}