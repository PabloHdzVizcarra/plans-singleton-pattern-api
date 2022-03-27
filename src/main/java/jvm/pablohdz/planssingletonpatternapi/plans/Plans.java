package jvm.pablohdz.planssingletonpatternapi.plans;

import java.util.Date;
import java.util.UUID;
import jvm.pablohdz.planssingletonpatternapi.dto.PlansDto;
import jvm.pablohdz.planssingletonpatternapi.model.PlansEntity;
import jvm.pablohdz.planssingletonpatternapi.repository.PlansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Plans {
  private final PlansRepository plansRepository;
  private PlansEntity plansCurrentEntity;

  @Autowired
  public Plans(PlansRepository plansRepository) {
    this.plansRepository = plansRepository;
  }
  
  
  public void createModel(PlansDto dto) {
    PlansEntity entity = new PlansEntity();
    entity.setCreated(new Date().getTime());
    entity.setAmount(dto.getAmount());
    entity.setBillingScheme(dto.getBillingScheme());
    entity.setCurrency("mxn");
    entity.setId("plans_" + UUID.randomUUID());
    entity.setInterval(dto.getInterval());
    entity.setIntervalCount(dto.getIntervalCount());
    entity.setNickname("plans_" + generateRandomNumbersWithLength());
    entity.setObject("plan");
    entity.setProduct("buy product");
    entity.setTrialPeriodDays(dto.getTrialPeriodDays());
  
    this.plansCurrentEntity = entity;
  }
  
  private String generateRandomNumbersWithLength() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      sb.append(Math.random());
    }
    return sb.toString();
  }
  
  public void persist() {
    plansRepository.save(plansCurrentEntity);
  }
}
