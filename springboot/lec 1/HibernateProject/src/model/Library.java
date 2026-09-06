package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "LIBRARY")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "library")
    private List<Book> books;

    public Library() {
    }
}