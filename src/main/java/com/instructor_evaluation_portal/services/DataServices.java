package com.instructor_evaluation_portal.services;

import java.util.List;

import com.instructor_evaluation_portal.model.*;

public interface DataServices {


    //Web Services for the Admin_Users CRUD operations
    public boolean addAdmin(Admin adminUser) throws Exception;

    public Admin getAdminById(long id) throws Exception;

    public List<Admin> getAdminList() throws Exception;

    public boolean deleteAdmin(long id) throws Exception;

    //Web Services for the Dean CRUD operations
    public boolean addDean(Dean dean) throws Exception;

    public Dean getDeanById(long id) throws Exception;

    public List<Dean> getDeanList() throws Exception;

    public boolean deleteDean(long id) throws Exception;

    //Web Services for the Student CRUD operations
    public boolean addStudent(Student student) throws Exception;

    public Student getStudentById(long id) throws Exception;

    public List<Student> getStudentList() throws Exception;

    public boolean deleteStudent(long id) throws Exception;

    //Web Services for the Faculty CRUD operations
    public boolean addFaculty(Faculty faculty) throws Exception;

    public Faculty getFacultyById(long id) throws Exception;

    public List<Faculty> getFacultyList() throws Exception;

    public boolean deleteFaculty(long id) throws Exception;

    public boolean createNewInstructorAccount(InstructorDetails instructor) throws Exception;

    public InstructorDetails viewInstructorDetails(long id) throws Exception;

    public List<InstructorDetails> getInstructorList() throws Exception;

    public boolean deleteInstructor(long id) throws Exception;


    // DAO methods for Feedback operations
    public boolean fillFeedback(Feedback feedback) throws Exception;

    public boolean removeFeedback(long id) throws Exception;




}
