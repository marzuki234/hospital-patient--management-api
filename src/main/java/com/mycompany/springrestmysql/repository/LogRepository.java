package com.mycompany.springrestmysql.repository;

import com.mycompany.springrestmysql.model.Log;
import org.springframework.data.domain.Pageable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface LogRepository extends PagingAndSortingRepository<Log, Long>,CrudRepository<Log, Long>,JpaRepository<Log, Long>, JpaSpecificationExecutor<Log> {

    public List<Log> findByFirstName(String firstName);


}

