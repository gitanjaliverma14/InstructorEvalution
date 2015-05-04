/*
package com.instructor_evaluation_portal.model;

import javax.annotation.Resource;

import com.instructor_evaluation_portal.dao.DataDaoImplementation;
import junit.framework.Assert;

import org.junit.Test;

import java.util.List;


public class ComplaintTest extends BaseTest {

    @Resource
    private DataDaoImplementation dataDaoTestForComplaint;

    @Test
    public void getAllComplaintsListTest() throws Exception {
        Assert.assertNotNull(dataDaoTestForComplaint.getAllComplaints().isEmpty());

        List<Admin> allComplaints = dataDaoTestForComplaint.getAllComplaints();

        for (int i = 0; i < allComplaints.size(); i++) {
            System.out.println("Name of the complaint filing person : " + allComplaints.get(i).getNameOfPerson());
            System.out.println("Subject of the Admin : " + allComplaints.get(i).getSubject());
            System.out.println("Admin Description : " + allComplaints.get(i).getComplaintDescription());
        }
    }

    @Test
    public void addComplaint() throws Exception {
        Admin complaint = new Admin();

        complaint.setNameOfPerson("AayushKumar");
        complaint.setSubject("Admin for Pencils");
        complaint.setComplaintDescription("Pencils were not that great!!. Lead broke out very easily.");

        dataDaoTestForComplaint.addComplaint(complaint);

        Assert.assertNotNull(dataDaoTestForComplaint.getAllComplaints());

        System.out.println("Filed Admin is " + dataDaoTestForComplaint.getAllComplaints());
    }
}
*/
