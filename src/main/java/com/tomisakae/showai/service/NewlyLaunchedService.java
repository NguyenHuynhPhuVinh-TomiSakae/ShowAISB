package com.tomisakae.showai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    
    public Page<NewlyLaunched> getAllNewlyLaunched(Pageable pageable) {
        return repository.findAll(pageable);
    }
    
    public List<NewlyLaunched> getAllNewlyLaunchedWithoutPaging() {
        return repository.findAll();
    }
}
