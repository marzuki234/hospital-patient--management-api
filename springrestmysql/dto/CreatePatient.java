package com.mycompany.springrestmysql.dto;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class CreatePatient {
    
        


    @ApiModelProperty(example = "mohd")
    @NotBlank(message = "value must not be blank")
    @NotNull(message = "value must not be blank")
    @NotEmpty(message = "value must not be blank")
    private String firstName;

    @ApiModelProperty(example = "ali", position = 2)
    @NotBlank(message = "value must not be blank")
    @NotNull(message = "value must not be blank")
    @NotEmpty(message = "value must not be blank")
    private String lastName;
    
    @ApiModelProperty(example = "11/08/1985", position = 3)
    private Date dateOfBirth;
    
    
    @ApiModelProperty(example = "60125544123", position = 4)
    @NotBlank(message = "value must not be blank")
    @NotNull(message = "value must not be blank")
    @NotEmpty(message = "value must not be blank")
    private static final String PHONE_REGEX = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
    @Pattern(regexp = PHONE_REGEX, message = "Invalid phone number format")
   
    private String phoneNumber;
    
    
    @ApiModelProperty(example = "marzuki@lapasar.com", position = 5)
    @Email
    private String email;
    
    @ApiModelProperty(example = "no 16,persiaran surian..", position = 6)
    private String address;
     
    @ApiModelProperty(example = "Ali 60125544123", position = 7)
    private String emergencyContact;
      
    @ApiModelProperty(example = "A_POSITIVE", position = 8)
    private Enum bloodType;
       
    @ApiModelProperty(example = "true", position = 9)
    private  Boolean isActive;
        
   
}
