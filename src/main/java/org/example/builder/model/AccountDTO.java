package org.example.builder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class AccountDTO {

    @Id
    @GeneratedValue
    @Column(name = "account_id")
    int accountId;
    String userName;
    String password;

}
