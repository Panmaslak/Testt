package com.example.application.service;

import com.example.application.model.Subject;
import com.example.application.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

}
