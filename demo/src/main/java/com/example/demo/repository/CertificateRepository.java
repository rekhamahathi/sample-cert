package com.example.demo.repository;

import com.example.demo.entity.Certificate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificateRepository extends IBaseRepository<Certificate, Long> {

    @Query("SELECT c from Certificate c where datediff(c.expiryDate,CURDATE()) BETWEEN 0 and 7")
    public List<Certificate> findCertificatesLessThan7();

    @Query("SELECT c from Certificate c where datediff(c.expiryDate,CURDATE()) BETWEEN 7 and 14")
    public List<Certificate> findCertificatesLessThan14();

    @Query("SELECT c from Certificate c where datediff(c.expiryDate,CURDATE()) BETWEEN 14 and 30")
    public List<Certificate> findCertificatesLessThan30();

}