package com.instructor_evaluation_portal.dao;

import java.util.List;

import com.instructor_evaluation_portal.model.*;

public interface DataDao {

    // DAO methods for Admin InstructorDetails operations
    public boolean addAdmin(Admin adminUser) throws Exception;

    public Admin getAdminById(long id) throws Exception;

    public List<Admin> getAdminList() throws Exception;

    public boolean deleteAdmin(long id) throws Exception;

    // DAO methods for Dean operations
    public boolean addDean(Dean dean) throws Exception;

    public Dean getDeanById(long id) throws Exception;

    public List<Dean> getDeanList() throws Exception;

    public boolean deleteDean(long id) throws Exception;

    //DAO methods for Student operations
    public boolean addStudent(Student student) throws Exception;

    public Student getStudentById(long id) throws Exception;

    public List<Student> getStudentList() throws Exception;

    public boolean deleteStudent(long id) throws Exception;

    //DAO methods for Faculty operations
    public boolean addFaculty(Faculty faculty) throws Exception;

    public Faculty getFacultyById(long id) throws Exception;

    public List<Faculty> getFacultyList() throws Exception;

    public boolean deleteFaculty(long id) throws Exception;

    // DAO methods for InstructorDetails operations
    public boolean createNewInstructorAccount(InstructorDetails instructor) throws Exception;

    public InstructorDetails viewInstructorDetails(long id) throws Exception;

    public List<InstructorDetails> getInstructorList() throws Exception;

    public boolean deleteInstructor(long id) throws Exception;

    
    // DAO methods for Feedback operations
    public boolean fillFeedback(Feedback feedback) throws Exception;

    public boolean removeFeedback(long id) throws Exception;

   /* // DAO methods for Admin operations
    public boolean addComplaint(Admin complaint) throws Exception;

    public List<Admin> getAllComplaints() throws Exception;*/
}
