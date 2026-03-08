package com.mycompany.springrestmysql.load;

import com.mycompany.springrestmysql.model.Patient;
import com.mycompany.springrestmysql.service.PatientService;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@Configuration
@EnableSpringDataWebSupport
@Slf4j
public class LoadPatientDatabase {

      enum bloodTypeValue {
  A_POSITIVE, A_NEGATIVE, B_POSITIVE, B_NEGATIVE,
AB_POSITIVE, AB_NEGATIVE, O_POSITIVE, O_NEGATIVE
}
    @Bean
    CommandLineRunner loadDatabase (PatientService patientService) {
        
        
        
        return args -> {
            log.info("Preloading " + patientService.savePatient(new Patient("Ahmad", "Marzuki",new Date("11/08/1985"),"60125544123","marzuki@lapasar.com","no 16,persiaran surian..","60125544123",bloodTypeValue.AB_NEGATIVE.toString(),true)));
        };

       // return null;
            }
}
