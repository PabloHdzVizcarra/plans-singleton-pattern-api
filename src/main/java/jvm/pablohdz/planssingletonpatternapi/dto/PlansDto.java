package jvm.pablohdz.planssingletonpatternapi.dto;

public class PlansDto {
  private String name;
  private String description;
  private Integer amount;
  private String billingScheme;
  private String interval;
  private Integer intervalCount;
  private String trialPeriodDays;
  
  public PlansDto(String name, String description, Integer amount, String billingScheme,
          String interval, Integer intervalCount, String trialPeriodDays) {
    this.name = name;
    this.description = description;
    this.amount = amount;
    this.billingScheme = billingScheme;
    this.interval = interval;
    this.intervalCount = intervalCount;
    this.trialPeriodDays = trialPeriodDays;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Integer getAmount() {
    return amount;
  }
  
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  
  public String getBillingScheme() {
    return billingScheme;
  }
  
  public void setBillingScheme(String billingScheme) {
    this.billingScheme = billingScheme;
  }
  
  public String getInterval() {
    return interval;
  }
  
  public void setInterval(String interval) {
    this.interval = interval;
  }
  
  public Integer getIntervalCount() {
    return intervalCount;
  }
  
  public void setIntervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
  }
  
  public String getTrialPeriodDays() {
    return trialPeriodDays;
  }
  
  public void setTrialPeriodDays(String trialPeriodDays) {
    this.trialPeriodDays = trialPeriodDays;
  }
  
  @Override
  public String toString() {
    return "PlansDto{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", amount=" + amount +
            ", billingScheme='" + billingScheme + '\'' +
            ", interval='" + interval + '\'' +
            ", intervalCount=" + intervalCount +
            ", trialPeriodDays='" + trialPeriodDays + '\'' +
            '}';
  }
}
