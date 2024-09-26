package com.crud.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statistics")
public class StatisticsFinal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; 
    
    private String timestamp;
    private String uploadedFileName;
    private String resultingFileName;
    private String logCodes;

    // Getters and Setters
  
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUploadedFileName() {
        return uploadedFileName;
    }

    public void setUploadedFileName(String uploadedFileName) {
        this.uploadedFileName = uploadedFileName;
    }

    public String getResultingFileName() {
        return resultingFileName;
    }

    public void setResultingFileName(String resultingFileName) {
        this.resultingFileName = resultingFileName;
    }

    public String getLogCodes() {
        return logCodes;
    }

    public void setLogCodes(String logCodes) {
        this.logCodes = logCodes;
    }
}
