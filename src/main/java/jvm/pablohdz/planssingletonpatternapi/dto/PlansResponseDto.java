package jvm.pablohdz.planssingletonpatternapi.dto;

public class PlansResponseDto {
    private String id;
    private String name;
    private String description;
    private String object;
    private Boolean active;
    private Integer amount;
    private String billingScheme;
    private String currency;
    private String interval;
    private Integer intervalCount;
    private String trialPeriodDays;
    
    public PlansResponseDto() {
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
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
    
    public String getObject() {
        return object;
    }
    
    public void setObject(String object) {
        this.object = object;
    }
    
    public Boolean getActive() {
        return active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
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
    
    public String getCurrency() {
        return currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
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
}
