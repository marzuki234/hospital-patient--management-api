package com.mycompany.springrestmysql.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="first_name")
    private String firstName;
    
    private String lastName;
    private Date dateOfBirth;
    private String phoneNumber;
     @Column(name="email")
    private String email;
     
      @Column(name="address")
    private String address;
    private String emergencyContact;
    private String bloodType;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
  

    public Patient (String firstName, String lastName, Date dateOfBirth, String phoneNumber, String email, String address, String emergencyContact, String bloodType, Boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.emergencyContact = emergencyContact;
      
        this.bloodType = bloodType;
        this.isActive = isActive;
        //this.createdAt = createdAt;
        //this.updatedAt = updatedAt;
        
    }
}
