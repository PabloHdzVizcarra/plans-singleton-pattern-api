package jvm.pablohdz.planssingletonpatternapi.service;

import java.util.List;
import jvm.pablohdz.planssingletonpatternapi.dto.DeleteResponse;
import jvm.pablohdz.planssingletonpatternapi.dto.PlansDto;
import jvm.pablohdz.planssingletonpatternapi.dto.PlansResponseDto;
import jvm.pablohdz.planssingletonpatternapi.model.PlansEntity;
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

  public PlansEntity createPlan(PlansDto plan) {
    plans.createModel(plan);
    return plans.persist();
  }

  public List<PlansResponseDto> getAllPlans() {
    return plans.retrieveAll();
  }

  public PlansEntity getOne(String id) {
    return plans.retrieveById(id);
  }

  public DeleteResponse delete(String id) {
    String idPlansDeleted = plans.deleteById(id);
    return new DeleteResponse(idPlansDeleted, "plan", true);
  }
}
