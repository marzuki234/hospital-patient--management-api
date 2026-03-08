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
public class CreateLog {
    
        


    @ApiModelProperty(example = "mohd")

    private String firstName;

    @ApiModelProperty(example = "ali", position = 2)

    private String lastName;
   

   
}
