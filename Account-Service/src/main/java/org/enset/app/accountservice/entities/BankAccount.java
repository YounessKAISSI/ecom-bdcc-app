package org.enset.app.accountservice.entities;


import jakarta.persistence.*;
import lombok.*;
import org.enset.app.accountservice.enums.AccountType;
import org.enset.app.accountservice.model.Customer;

import java.time.LocalDate;
@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}