package com.crud.demo.service;

import com.crud.demo.model.StatisticsFinal;
import com.crud.demo.repository.StatisticsFinalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class StatisticsFinalService {

    @Autowired
    private StatisticsFinalRepository statisticsFinalRepository;

    public void saveStatistics(Long userId, String uploadedFileName, String resultingFileName, String logCodes) {
        StatisticsFinal stats = new StatisticsFinal();
        stats.setUserId(userId); 
        stats.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        stats.setUploadedFileName(uploadedFileName);
        stats.setResultingFileName(resultingFileName);
        stats.setLogCodes(logCodes);

        statisticsFinalRepository.save(stats);
    }
}
