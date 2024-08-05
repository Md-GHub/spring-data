package com.mdghub.springdatajpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @SequenceGenerator(
            name="course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    private Long courseId;
    private String title;
    private int credit;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;
    public Course() {
    }

    public Course(String title, int credit) {
        this.title = title;
        this.credit = credit;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", credit=" + credit +
                '}';
    }
}
