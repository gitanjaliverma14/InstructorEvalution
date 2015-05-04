package com.instructor_evaluation_portal.services;

import java.util.List;

import com.instructor_evaluation_portal.model.*;
import org.springframework.beans.factory.annotation.Autowired;


import com.instructor_evaluation_portal.dao.DataDao;

public class DataServicesImplementation implements DataServices {

	@Autowired
	DataDao dataDao;
    @Override
    public boolean createNewInstructorAccount(InstructorDetails instructor) throws Exception {
        return dataDao.createNewInstructorAccount(instructor);
    }

    @Override
    public InstructorDetails viewInstructorDetails(long id) throws Exception {
        return dataDao.viewInstructorDetails(id);
    }

    @Override
    public List<InstructorDetails> getInstructorList() throws Exception {
        return dataDao.getInstructorList();
    }

    @Override
    public boolean deleteInstructor(long id) throws Exception {
        return dataDao.deleteInstructor(id);
    }

    // Method Implementations for Feedback operations
    @Override
    public boolean fillFeedback(Feedback feedback) throws Exception {
        return dataDao.fillFeedback(feedback);
    }

    @Override
    public boolean removeFeedback(long id) throws Exception {
        return dataDao.removeFeedback(id);
    }

    // Method Implementations for Admin
    @Override
    public boolean addAdmin(Admin adminUser) throws Exception {
        return dataDao.addAdmin(adminUser);
    }

    @Override
    public Admin getAdminById(long id) throws Exception{
        return dataDao.getAdminById(id);
    }

    @Override
    public List<Admin> getAdminList() throws Exception {
        return dataDao.getAdminList();
    }

    @Override
    public boolean deleteAdmin(long id) throws Exception {
        return dataDao.deleteAdmin(id);
    }

    // Method Implementations for Dean
    @Override
    public boolean addDean(Dean dean) throws Exception {
        return dataDao.addDean(dean);
    }

    @Override
    public Dean getDeanById(long id) throws Exception{
        return dataDao.getDeanById(id);
    }

    @Override
    public List<Dean> getDeanList() throws Exception {
        return dataDao.getDeanList();
    }

    @Override
    public boolean deleteDean(long id) throws Exception {
        return dataDao.deleteDean(id);
    }

    // Method Implementations for Student
    @Override
    public boolean addStudent(Student student) throws Exception {
        return dataDao.addStudent(student);
    }

    @Override
    public Student getStudentById(long id) throws Exception{
        return dataDao.getStudentById(id);
    }

    @Override
    public List<Student> getStudentList() throws Exception {
        return dataDao.getStudentList();
    }

    @Override
    public boolean deleteStudent(long id) throws Exception {
        return dataDao.deleteStudent(id);
    }

    // Method Implementations for Faculty
    @Override
    public boolean addFaculty(Faculty faculty) throws Exception {
        return dataDao.addFaculty(faculty);
    }

    @Override
    public Faculty getFacultyById(long id) throws Exception{
        return dataDao.getFacultyById(id);
    }

    @Override
    public List<Faculty> getFacultyList() throws Exception {
        return dataDao.getFacultyList();
    }

    @Override
    public boolean deleteFaculty(long id) throws Exception {
        return dataDao.deleteFaculty(id);
    }
}
