package com.project.vince.bricol.controller;

import com.project.vince.bricol.dto.BricolDTO;
import com.project.vince.bricol.service.BricolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bricols")
public class BricolController {

    private final BricolService bricolService;


    public BricolController(BricolService bricolService) {
        this.bricolService = bricolService;
    }

    @GetMapping("")
    public ResponseEntity<List<BricolDTO>> getAllBricols() {
        return ResponseEntity.ok(bricolService.getAllBricols());
    }
}
