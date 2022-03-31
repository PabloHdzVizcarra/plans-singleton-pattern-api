package jvm.pablohdz.planssingletonpatternapi.plans;

import static jvm.pablohdz.planssingletonpatternapi.component.CachePlansComponent.CACHE_OFF;
import static jvm.pablohdz.planssingletonpatternapi.component.CachePlansComponent.CACHE_ON;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import jvm.pablohdz.planssingletonpatternapi.component.CachePlansComponent;
import jvm.pablohdz.planssingletonpatternapi.dto.PlansDto;
import jvm.pablohdz.planssingletonpatternapi.dto.PlansResponseDto;
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
    int leftLimit = 97;
    int rightLimit = 122;
    int targetStringLength = 8;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
      int randomLimitedInt = leftLimit + (int)
              (random.nextFloat() * (rightLimit - leftLimit + 1));
      buffer.append((char) randomLimitedInt);
    }
    return buffer.toString();
  }
  
  public PlansEntity persist() {
    CachePlansComponent.setCache(CACHE_OFF);
    return plansRepository.save(plansCurrentEntity);
  }
  
  public List<PlansResponseDto> retrieveAll() {
    
    if (CachePlansComponent.haveCacheAvailable() != null) {
      return CachePlansComponent.getCacheById("company1");
    }
    
    List<PlansResponseDto> dtoList = plansRepository.findAll().stream()
            .map(this::mapPlansToPlansResponseDto).collect(Collectors.toList());
    
    CachePlansComponent.saveCache(dtoList);
    CachePlansComponent.setCache(CACHE_ON);
    
    return dtoList;
  }
  
  public PlansEntity retrieveById(String id) {
    return plansRepository.findById(id).orElseThrow(RuntimeException::new);
  }
  
  public String deleteById(String id) {
    plansRepository.deleteById(id);
    CachePlansComponent.setCache(CACHE_OFF);
    return id;
  }
  
  public PlansResponseDto mapPlansToPlansResponseDto(PlansEntity entity) {
    PlansResponseDto dto = new PlansResponseDto();
    dto.setAmount(entity.getAmount());
    dto.setName(entity.getName());
    dto.setBillingScheme(entity.getBillingScheme());
    dto.setCurrency(entity.getCurrency());
    dto.setId(entity.getId());
    dto.setInterval(entity.getInterval());
    dto.setIntervalCount(entity.getIntervalCount());
    dto.setObject(entity.getObject());
    dto.setTrialPeriodDays(entity.getTrialPeriodDays());
    dto.setDescription(entity.getDescription());
    dto.setActive(entity.getActive());
    dto.setcreated(entity.getCreated());
    return dto;
  }
}
