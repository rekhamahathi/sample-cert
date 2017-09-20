package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "CERTIFICATES")
public class Certificate {

    @Id
    @GeneratedValue
    @Column(name="CERTIFICATE_ID")
    private long id;

    @Column(name="CERTIFICATE_NAME")
    private String certificateName;

    @Column(name="CERTIFICATE_PROVIDER")
    private String certificateProvider;

    @Column(name="EXPIRY_DATE")
    private String expiryDate;

    public Certificate() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateProvider() {
        return certificateProvider;
    }

    public void setCertificateProvider(String certificateProvider) {
        this.certificateProvider = certificateProvider;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
