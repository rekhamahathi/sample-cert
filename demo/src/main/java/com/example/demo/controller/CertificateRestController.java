package com.example.demo.controller;

import com.example.demo.entity.Certificate;
import com.example.demo.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CertificateRestController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping(path = "/7/certificates")
    public List<Certificate> getAllCertificatesLessThan7() {
        return certificateService.getAllCertificatesLessThan7();
    }

    @GetMapping(path = "/14/certificates")
    public List<Certificate> getAllCertificatesLessThan14() {
        return certificateService.getAllCertificatesLessThan14();
    }

    @GetMapping(path = "/30/certificates")
    public List<Certificate> getAllCertificatesLessThan30() {
        return certificateService.getAllCertificatesLessThan30();
    }

    @GetMapping(value = "/certificate/{id}")
    public Certificate getCertificateById(@PathVariable("id") long id) {
        return certificateService.getCertificateById(id);
    }
}
