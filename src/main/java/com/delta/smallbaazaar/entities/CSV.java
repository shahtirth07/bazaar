package com.delta.smallbaazaar.entities;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.*;

@ConfigurationProperties(prefix = "file")
@Entity(name = "csv")
public class CSV {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int suplierId;

    @Column
    String fileName;

    @Column
    private String uploadDir;
    private String extension;

    public CSV() {
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public CSV(int suplierId, String fileName, String uploadDir, String extension) {
        this.suplierId = suplierId;
        this.fileName = fileName;
        this.uploadDir = uploadDir;
        this.extension = extension;
    }

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public int getSuplierId() {
        return suplierId;
    }

    public void setSuplierId(int suplierId) {
        this.suplierId = suplierId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDocumentFormat(String contentType) {
        this.extension = contentType;
    }
}
