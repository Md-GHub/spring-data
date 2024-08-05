package com.mdghub.springdatajpa.repository;

import com.mdghub.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepositary extends JpaRepository<Student, Long> {

    @Query(value = "SELECT s FROM Student s" , nativeQuery = false)
    public List<Student> fetchAllCustomStudents();

    @Query(value = "SELECT s FROM Student s where firstName = :val" , nativeQuery = false)
    public List<Student> fetchUsingName(@Param("val") String name);

    @Query(value = "SELECT s.id FROM Student s where firstName = :val" , nativeQuery = false)
    public long fetchIdByName(@Param("val") String name);
}
