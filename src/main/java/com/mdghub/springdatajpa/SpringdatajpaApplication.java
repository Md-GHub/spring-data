package com.mdghub.springdatajpa;

import com.mdghub.springdatajpa.entity.Course;
import com.mdghub.springdatajpa.entity.CourseMaterial;
import com.mdghub.springdatajpa.entity.Guardian;
import com.mdghub.springdatajpa.entity.Student;
import com.mdghub.springdatajpa.repository.CourseMaterialRepository;
import com.mdghub.springdatajpa.repository.CourseRepository;
import com.mdghub.springdatajpa.repository.StudentRepositary;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.mdghub.springdatajpa.entity") // Adjust package as necessary
@EnableJpaRepositories(basePackages = "com.mdghub.springdatajpa.repository")
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CourseMaterialRepository repo1, CourseRepository repo2) {
		return args -> {

			System.out.println(repo1.findAll());
		};
	}
}
