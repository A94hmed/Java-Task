package com.example.Employee_Application.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Email {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "email_seq"
    )
    @SequenceGenerator(
            name = "email_seq",
            sequenceName = "email_seq",
            allocationSize = 1
    )
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
