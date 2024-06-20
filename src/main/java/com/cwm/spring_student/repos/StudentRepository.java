package com.cwm.spring_student.repos;

import com.cwm.spring_student.domain.Student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

    boolean existsByEmailIgnoreCase(String email);

    boolean existsByContact(Long contact);
    
    Optional<Student> findByEmail(String email);
    

}
