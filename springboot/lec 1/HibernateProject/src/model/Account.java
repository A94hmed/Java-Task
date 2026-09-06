package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

    public Account() {
    }
}