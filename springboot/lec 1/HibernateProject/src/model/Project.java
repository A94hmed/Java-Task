package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "PROJECT_EMPLOYEE",
        joinColumns = @JoinColumn(name = "PROJECT_ID"),
        inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID")
    )
    private List<Employee> employees;

    public Project() {
    }
}