package com.instructor_evaluation_portal.model;

/**
 * Created by Gitanjali on 16-04-2015.
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "feedback_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Feedback implements Serializable{
    @Column(name = "id")
    private long id;

    @Column(name = "organisation and coherence")
    private long organisationCoherence;

    @Column(name = "teaching skills")
    private long teachingSkills;

    @Column(name = "continuous interaction")
    private long continuousInteraction;

    @Column(name = "course content")
    private long courseContent;

    @Column(name = "perceived usefulness")
    private long perceivedUsefulness;

    @Column(name = "home work")
    private long homeWork;

    @Column(name = "evaluation process")
    private long evaluationProcess;

    @Column(name = "your participation")
    private long yourParticipation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrganisationCoherence() {
        return organisationCoherence;
    }

    public void setOrganisationCoherence(long organisationCoherence) {
        this.organisationCoherence = organisationCoherence;
    }

    public long getTeachingSkills() {
        return teachingSkills;
    }

    public void setTeachingSkills(long teachingSkills) {
        this.teachingSkills = teachingSkills;
    }

    public long getContinuousInteraction() {
        return continuousInteraction;
    }

    public void setContinuousInteraction(long continuousInteraction) {
        this.continuousInteraction = continuousInteraction;
    }

    public long getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(long courseContent) {
        this.courseContent = courseContent;
    }

    public long getPerceivedUsefulness() {
        return perceivedUsefulness;
    }

    public void setPerceivedUsefulness(long perceivedUsefulness) {
        this.perceivedUsefulness = perceivedUsefulness;
    }

    public long getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(long homeWork) {
        this.homeWork = homeWork;
    }

    public long getEvaluationProcess() {
        return evaluationProcess;
    }

    public void setEvaluationProcess(long evaluationProcess) {
        this.evaluationProcess = evaluationProcess;
    }

    public long getYourParticipation() {
        return yourParticipation;
    }

    public void setYourParticipation(long yourParticipation) {
        this.yourParticipation = yourParticipation;
    }
}
