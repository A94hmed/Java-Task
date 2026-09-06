package model;

import javax.persistence.*;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PAYMENT_ID")
    private Payment payment;

    public Invoice() {
    }
}