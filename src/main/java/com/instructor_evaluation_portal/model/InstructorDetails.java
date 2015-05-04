package com.instructor_evaluation_portal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "instructor_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class InstructorDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private long age;

    @Column(name = "dob")
    private String dob;

    @Column(name = "address")
    private String address;

    @Column(name = "contact no")
    private long contactNumber;

    @Column(name = "email id")
    private String emailId;

    @Column(name = "department")
    private String department;

    @Column(name = "academic qualification")
    private String academicQualification;

    @Column(name = "teaching experience")
    private long teachingExperience;

    @Column(name = "no of courses instructed")
    private long noOfCoursesInstructed;

    @Column(name = "list of courses instructed")
    private String listOfCoursesInstructed;

    @Column(name = "performance index")
    private long performanceIndex;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getDOB() {
        return dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAcademicQualification() {
        return academicQualification;
    }

    public void setAcademicQualification(String academicQualification) {
        this.academicQualification = academicQualification;
    }

    public long getTeachingExperience() {
        return teachingExperience;
    }

    public void setTeachingExperience(long teachingExperience) {
        this.teachingExperience = teachingExperience;
    }

    public long getNoOfCoursesInstructed() {
        return noOfCoursesInstructed;
    }

    public void setNoOfCoursesInstructed(long noOfCoursesInstructed) {
        this.noOfCoursesInstructed = noOfCoursesInstructed;
    }

    public String getListOfCoursesInstructed() {
        return listOfCoursesInstructed;
    }

    public void setListOfCoursesInstructed(String listOfCoursesInstructed) {
        this.listOfCoursesInstructed = listOfCoursesInstructed;
    }

    public long getPerformanceIndex() {
        return performanceIndex;
    }

    public void setPerformanceIndex() {
        this.performanceIndex = performanceIndex;
    }
}

