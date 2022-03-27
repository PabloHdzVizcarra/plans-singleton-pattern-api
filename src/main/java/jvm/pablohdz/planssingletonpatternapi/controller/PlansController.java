package jvm.pablohdz.planssingletonpatternapi.controller;

import java.util.List;
import jvm.pablohdz.planssingletonpatternapi.dto.PlansDto;
import jvm.pablohdz.planssingletonpatternapi.model.PlansEntity;
import jvm.pablohdz.planssingletonpatternapi.service.PlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<?> createPlan(@RequestBody PlansDto plan) {
        plansService.createPlan(plan);
        return ResponseEntity.ok(plan);
    }
    
    @GetMapping
    public ResponseEntity<?> getPlans() {
        List<PlansEntity> plans = plansService.getAllPlans();
        return ResponseEntity.ok(plans);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        PlansEntity plansEntity = plansService.getOne(id);
        return ResponseEntity.ok(plansEntity);
    }
}
