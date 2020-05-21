package com.bridgelabz.lmsapplication.dto;

import java.util.Date;

public class HiredCandidateDto {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailId;
    private String hiredCity;
    private String Degree;
    private Date hiredDate;
    private long mobileNumber;
    private long permanentPincode;
    private String hiredLab;
    private String attitude;
    private String communicationRemark;
    private String knowledgeRemark;
    private String aggregateRemark;
    private String status;
    private Date creatorStamp;
    private String creatorUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getHiredCity() {
        return hiredCity;
    }

    public void setHiredCity(String hiredCity) {
        this.hiredCity = hiredCity;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getPermanentPincode() {
        return permanentPincode;
    }

    public void setPermanentPincode(long permanentPincode) {
        this.permanentPincode = permanentPincode;
    }

    public String getHiredLab() {
        return hiredLab;
    }

    public void setHiredLab(String hiredLab) {
        this.hiredLab = hiredLab;
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }

    public String getCommunicationRemark() {
        return communicationRemark;
    }

    public void setCommunicationRemark(String communicationRemark) {
        this.communicationRemark = communicationRemark;
    }

    public String getKnowledgeRemark() {
        return knowledgeRemark;
    }

    public void setKnowledgeRemark(String knowledgeRemark) {
        this.knowledgeRemark = knowledgeRemark;
    }

    public String getAggregateRemark() {
        return aggregateRemark;
    }

    public void setAggregateRemark(String aggregateRemark) {
        this.aggregateRemark = aggregateRemark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatorStamp() {
        return creatorStamp;
    }

    public void setCreatorStamp(Date creatorStamp) {
        this.creatorStamp = creatorStamp;
    }

    public String getCreatorUser() {
        return creatorUser;
    }

    public void setCreatorUser(String creatorUser) {
        this.creatorUser = creatorUser;
    }
}