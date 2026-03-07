package com.mycompany.springrestmysql.repository;

import com.mycompany.springrestmysql.model.Patient;
import org.springframework.data.domain.Pageable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface PatientRepository extends PagingAndSortingRepository<Patient, Long>,CrudRepository<Patient, Long>,JpaRepository<Patient, Long>, JpaSpecificationExecutor<Patient> {

    public List<Patient> findByFirstName(String firstName);


}

