package com.bridgelabz.lmsapplication.service;

import com.bridgelabz.lmsapplication.model.HiredCandidateModel;

import java.util.List;

public interface IHiredCandidateService {
    void loadHiredCandidateSheet(String filePath);

    List getHiredCandidatesList();

    HiredCandidateModel getHiredCandidatesProfile(Long candidateId);
}
