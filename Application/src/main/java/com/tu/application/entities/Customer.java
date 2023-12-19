package com.tu.application.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "customer_id")
    private Long customerId;

    @OneToOne
    @JoinColumn(name = "user_id")
    @NotNull
    User user;

    @NotNull
    @Column(name = "phone", unique = true)
    private String phone;

}
