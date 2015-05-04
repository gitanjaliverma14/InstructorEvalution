package com.instructor_evaluation_portal.controller;

import com.instructor_evaluation_portal.model.Faculty;
import com.instructor_evaluation_portal.model.Status;
import com.instructor_evaluation_portal.model.Student;
import com.instructor_evaluation_portal.services.DataServices;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Gitanjali on 21-04-2015.
 */
public class FacultyController {

    @Autowired
    DataServices dataServices;

    static final Logger logger = Logger.getLogger(Faculty.class);

    @RequestMapping(value = "/addFaculty", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addFaculty(@RequestBody Faculty faculty) {

        try {
            dataServices.addFaculty(faculty);
            return new Status(1, "Faculty User added successfully");
        } catch(Exception e) {

            return new Status(0,e.toString());
        }
    }

    @RequestMapping(value = "faculty/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Faculty getFacultyById(@PathVariable("id") long id) {

        Faculty faculty = null;

        try {
            faculty = dataServices.getFacultyById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return faculty;
    }

    @RequestMapping(value = "/listFaculty", method = RequestMethod.GET)
    public @ResponseBody
    List<Faculty> getFacultyList() {

        List<Faculty> facultyList = null;
        try {
            facultyList = dataServices.getFacultyList();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return facultyList;
    }

    @RequestMapping(value = "deleteFaculty/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status deleteFaculty(@PathVariable("id") long id) {

        try {
            dataServices.deleteFaculty(id);
            return new Status(1, "Faculty User deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }
}
