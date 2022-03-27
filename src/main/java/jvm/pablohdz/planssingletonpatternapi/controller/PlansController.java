package jvm.pablohdz.planssingletonpatternapi.controller;

import jvm.pablohdz.planssingletonpatternapi.dto.PlansDto;
import jvm.pablohdz.planssingletonpatternapi.service.PlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("v1/plans")
public class PlansController {
    private final PlansService plansService;
    
    @Autowired
    public PlansController(PlansService plansService) {
        this.plansService = plansService;
    }
    
    @PostMapping
    public ResponseEntity<PlansDto> createPlan(@RequestBody PlansDto plan) {
        plansService.createPlan(plan);
        return ResponseEntity.ok(plan);
    }
}
