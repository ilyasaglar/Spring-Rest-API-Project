package com.ilyas.thymeleafdemo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ilyas.thymeleafdemo.entity.Student;


@RepositoryRestResource(path="student")
public interface StudentRepository extends JpaRepository<Student, Integer>  {

	
}
