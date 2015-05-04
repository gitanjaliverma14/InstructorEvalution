package com.instructor_evaluation_portal.controller;

import java.util.List;

import com.instructor_evaluation_portal.model.Dean;
import com.instructor_evaluation_portal.model.InstructorDetails;
import com.instructor_evaluation_portal.model.Status;
import javafx.animation.Animation;
import org.apache.log4j.Logger;
import com.instructor_evaluation_portal.model.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.instructor_evaluation_portal.services.DataServices;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    DataServices dataServices;

    static final Logger logger = Logger.getLogger(InstructorController.class);

    @RequestMapping(value = "/addInstructor", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addInstructor(@RequestBody InstructorDetails instructorDetails) {
        try {
            dataServices.createNewInstructorAccount(instructorDetails);
            return new Status(1, "Inventory added Successfully !");
        } catch (Exception e) {
            // e.printStackTrace();
            return new Status(0, e.toString());
        }

    }

    @RequestMapping(value = "viewInstructorDetails/{id}", method = RequestMethod.GET)
    public @ResponseBody
    InstructorDetails getInstructorById(@PathVariable("id") long id) {
        InstructorDetails instructor = null;
        try {
            instructor = dataServices.viewInstructorDetails(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return instructor;
    }

    @RequestMapping(value = "/listInstructors", method = RequestMethod.GET)
    public @ResponseBody
    List<InstructorDetails> getInstructorList() {

        List<InstructorDetails> instructorList = null;
        try {
            instructorList = dataServices.getInstructorList();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return instructorList;
    }

    @RequestMapping(value = "deleteInstructor/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status deleteInstructor(@PathVariable("id") long id) {

        try {
            dataServices.deleteInstructor(id);
            return new Status(1, "Inventory deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }

    }
}
