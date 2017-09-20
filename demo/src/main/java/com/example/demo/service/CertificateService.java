package com.example.demo.service;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    public List<Certificate> getAllCertificatesLessThan7() {
        return certificateRepository.findCertificatesLessThan7();
    }

    public List<Certificate> getAllCertificatesLessThan14() {
        return certificateRepository.findCertificatesLessThan14();
    }

    public List<Certificate> getAllCertificatesLessThan30() {
        return certificateRepository.findCertificatesLessThan30();
    }

    public Certificate getCertificateById(long id) {
        return certificateRepository.findOne(id);
    }
}
