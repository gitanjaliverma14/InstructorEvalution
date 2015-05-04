package com.instructor_evaluation_portal.controller;

import java.util.List;

import com.instructor_evaluation_portal.model.*;
import javafx.animation.Animation;
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
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    DataServices dataServices;

    static final Logger logger = Logger.getLogger(Feedback.class);

    @RequestMapping(value = "/fillFeedback", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status fillFeedback(@RequestBody Feedback feedback) {

        try {
            dataServices.fillFeedback(feedback);
            return new Status(1, "Feedback added successfully");
        } catch(Exception e) {

            return new Status(0,e.toString());
        }
    }

    @RequestMapping(value = "removeFeedback/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status removeFeedback(@PathVariable("id") long id) {

        try {
            dataServices.removeFeedback(id);
            return new Status(1, "Feedback Deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }
}