package com.spotifyclone.api.entities;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 
    private String username; 
    private String email; 
    private String password; 
    private String roles; 
    private String subscriptionStatus; // Add this line

    public UserEntity(String username, String password, String email, String roles, String subscriptionStatus) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.subscriptionStatus = subscriptionStatus; // Add this line
    }
}