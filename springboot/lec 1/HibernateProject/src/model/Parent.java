package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PARENT")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent")
    private List<Child> children;

    public Parent() {
    }
}