package com.tomisakae.showai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tomisakae.showai.service.NewlyLaunchedService;
import com.tomisakae.showai.model.NewlyLaunched;

import java.util.List;

@RestController
@RequestMapping(value = "/api/newly-launched", produces = "application/json;charset=UTF-8")
public class NewlyLaunchedController {

    @Autowired
    private NewlyLaunchedService service;
    
    @PostMapping
    public ResponseEntity<NewlyLaunched> createNewlyLaunched(@RequestBody NewlyLaunched newlyLaunched) {
        return ResponseEntity.ok(service.saveNewlyLaunched(newlyLaunched));
    }
    
    @GetMapping
    public ResponseEntity<List<NewlyLaunched>> getAllNewlyLaunched() {
        return ResponseEntity.ok(service.getAllNewlyLaunched());
    }
}
