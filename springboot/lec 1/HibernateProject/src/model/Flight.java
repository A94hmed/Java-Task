package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FLIGHT")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;

    @OneToMany(mappedBy = "flight")
    private List<Ticket> tickets;

    public Flight() {
    }
}