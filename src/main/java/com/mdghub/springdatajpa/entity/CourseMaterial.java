package com.mdghub.springdatajpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name="course_material")
public class CourseMaterial {

    @Id
    @SequenceGenerator(
            name="coursematerial_sequence",
            sequenceName = "coursematerial_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "coursematerial_sequence"
    )
    private Long courseMaterialId;
    private String url;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name= "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

    public CourseMaterial() {
    }

    public CourseMaterial(Course course, String url) {

        this.course = course;
        this.url = url;
    }

    public Long getCourseMaterialId() {
        return courseMaterialId;
    }

    public void setCourseMaterialId(Long courseMaterialId) {
        this.courseMaterialId = courseMaterialId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CourseMaterial{" +
                "courseMaterialId=" + courseMaterialId +
                ", url='" + url + '\'' +
                ", course=" + course +
                '}';
    }
}
