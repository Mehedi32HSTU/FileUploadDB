package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
	

}
