package model;

import javax.persistence.*;

@Entity
@Table(name = "TICKET")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;

    @ManyToOne
    @JoinColumn(name = "FLIGHT_ID")
    private Flight flight;

    public Ticket() {
    }
}