package com.its.dbex.service;

import com.its.dbex.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;

    public void save(String val1, String val2){
        System.out.println("DataService.save");
        dataRepository.save(val1, val2);
    }
}
