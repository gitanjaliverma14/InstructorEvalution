package com.instructor_evaluation_portal.controller;

import java.util.List;

import com.instructor_evaluation_portal.model.*;
import org.apache.log4j.Logger;
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
@RequestMapping("/dean")
public class DeanController {

    @Autowired
    DataServices dataServices;

    static final Logger logger = Logger.getLogger(Dean.class);

    @RequestMapping(value = "/addDean", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addDean(@RequestBody Dean dean) {

        try {
            dataServices.addDean(dean);
            return new Status(1, "Dean User added successfully");
        } catch(Exception e) {

            return new Status(0,e.toString());
        }
    }

    @RequestMapping(value = "dean/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Dean getDeanById(@PathVariable("id") long id) {

        Dean dean = null;

        try {
            dean = dataServices.getDeanById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dean;
    }

    @RequestMapping(value = "/listDean", method = RequestMethod.GET)
    public @ResponseBody
    List<Dean> getDeanList() {

        List<Dean> deanList = null;
        try {
            deanList = dataServices.getDeanList();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return deanList;
    }

    @RequestMapping(value = "deleteDean/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status deleteDean(@PathVariable("id") long id) {

        try {
            dataServices.deleteDean(id);
            return new Status(1, "Dean User deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }
}
