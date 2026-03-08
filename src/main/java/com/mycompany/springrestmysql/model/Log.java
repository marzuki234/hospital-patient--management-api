package com.mycompany.springrestmysql.model;

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
import javax.persistence.Lob;

@Data
@NoArgsConstructor
@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @Lob
    @Column(name="first_name")
    private String firstName;
    
    @Lob
    private String lastName;
     
        private LocalDateTime createdAt;

     


    public Log (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        
    }
}
