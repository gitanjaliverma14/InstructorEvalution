package com.instructor_evaluation_portal.controller;

import com.instructor_evaluation_portal.model.Dean;
import com.instructor_evaluation_portal.model.Status;
import com.instructor_evaluation_portal.model.Student;
import com.instructor_evaluation_portal.services.DataServices;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gitanjali on 20-04-2015.
 */
public class StudentController {
    @Autowired
    DataServices dataServices;

    static final Logger logger = Logger.getLogger(Student.class);

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addStudent(@RequestBody Student student) {

        try {
            dataServices.addStudent(student);
            return new Status(1, "Student User added successfully");
        } catch(Exception e) {

            return new Status(0,e.toString());
        }
    }

    @RequestMapping(value = "student/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Student getStudentById(@PathVariable("id") long id) {

        Student student = null;

        try {
            student = dataServices.getStudentById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    @RequestMapping(value = "/listStudent", method = RequestMethod.GET)
    public @ResponseBody
    List<Student> getStudentList() {

        List<Student> studentList = null;
        try {
            studentList = dataServices.getStudentList();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @RequestMapping(value = "deleteStudent/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status deleteStudent(@PathVariable("id") long id) {

        try {
            dataServices.deleteStudent(id);
            return new Status(1, "Student User deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }
}
