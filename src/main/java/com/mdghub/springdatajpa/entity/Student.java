package com.mdghub.springdatajpa.entity;


import jakarta.persistence.*;


@Entity
@Table(
        name = "student_db",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "student_email" ,
                        columnNames = "email"
                )
        }
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id",
            updatable = false,
            columnDefinition = "BIGINT(50)"
    )
    private long id;
    @Column(
            name = "first_name" ,
            nullable = false,
            columnDefinition = "VARCHAR(10)"
    )
    private String firstName;
    @Column(
            name = "lase_name" ,
            nullable = false,
            columnDefinition = "VARCHAR(10)"
    )
    private String lastName;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "VARCHAR(50)"
    )
    private String email;
    @Column(
            name = "age",
            nullable = false,
            columnDefinition = "INT(100)"
    )
    private int age;

    @Embedded
    private Guardian guardian;

    public Student() {}
    public Student(String firstName, String lastName, String email, int age ,Guardian guardian) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.guardian = guardian;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
