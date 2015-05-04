package com.instructor_evaluation_portal.controller;

import java.util.List;

import com.instructor_evaluation_portal.model.Admin;
import com.instructor_evaluation_portal.model.Status;
import com.instructor_evaluation_portal.model.Student;
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
@RequestMapping("/adminUsers")
public class AdminController {

    @Autowired
    DataServices dataServices;

    static final Logger logger = Logger.getLogger(Admin.class);

    @RequestMapping(value = "/addAdminUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addAdmin(@RequestBody Admin adminUser) {

        try {
            dataServices.addAdmin(adminUser);
            return new Status(1, "Admin User added successfully");
        } catch(Exception e) {

            return new Status(0,e.toString());
        }
    }

    @RequestMapping(value = "admin/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Admin getAdminById(@PathVariable("id") long id) {

        Admin admin = null;

        try {
            admin = dataServices.getAdminById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }

    @RequestMapping(value = "/listAdmin", method = RequestMethod.GET)
    public @ResponseBody
    List<Admin> getAdminList() {

        List<Admin> adminList = null;
        try {
            adminList = dataServices.getAdminList();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return adminList;
    }

    @RequestMapping(value = "deleteAdminUser/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status deleteAdminUser(@PathVariable("id") long id) {

        try {
            dataServices.deleteAdmin(id);
            return new Status(1, "Admin User deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }
}
