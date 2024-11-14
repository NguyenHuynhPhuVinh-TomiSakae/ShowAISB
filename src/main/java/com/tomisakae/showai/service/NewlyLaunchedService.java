package com.tomisakae.showai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tomisakae.showai.model.NewlyLaunched;
import com.tomisakae.showai.repository.NewlyLaunchedRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Service
@Slf4j
public class NewlyLaunchedService {
    
    @Autowired
    private NewlyLaunchedRepository repository;
    
    public NewlyLaunched saveNewlyLaunched(NewlyLaunched newlyLaunched) {
        return repository.save(newlyLaunched);
    }
    
    public List<NewlyLaunched> getAllNewlyLaunched() {
        return repository.findAll();
    }
}
