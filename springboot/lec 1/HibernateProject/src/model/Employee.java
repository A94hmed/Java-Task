package model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;
    
    @ManyToMany(mappedBy = "employees")
    private List<Project> projects;
    
    public Employee() {
    }
}