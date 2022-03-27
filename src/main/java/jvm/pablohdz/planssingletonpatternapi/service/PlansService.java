package jvm.pablohdz.planssingletonpatternapi.service;

import jvm.pablohdz.planssingletonpatternapi.dto.PlansDto;
import jvm.pablohdz.planssingletonpatternapi.plans.Plans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlansService {
    private final Plans plans;
    
    @Autowired
    public PlansService(Plans plans) {
        this.plans = plans;
    }
    
    public void createPlan(PlansDto plan) {
        plans.createModel(plan);
        plans.persist();
    }
}
