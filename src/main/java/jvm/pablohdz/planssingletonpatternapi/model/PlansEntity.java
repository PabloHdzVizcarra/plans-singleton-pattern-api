package jvm.pablohdz.planssingletonpatternapi.model;

import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "plans")
public class PlansEntity {
    @Id private String id;
    
    @NotBlank
    private String name;
    private String description;
    private String object;
    private Boolean active;
    private Integer amount;
    
    @Field(name = "billing_scheme")
    private String billingScheme;
    private Long created;
    private String currency;
    private String interval;
    
    @Field(name = "interval_count")
    private Integer intervalCount;
    private String nickname;
    private String product;
    
    @Field( name = "trial_period_days")
    private String trialPeriodDays;
    
    public PlansEntity() {
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
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
    
    public Long getCreated() {
        return created;
    }
    
    public void setCreated(Long created) {
        this.created = created;
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
    
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public String getProduct() {
        return product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    
    public String getTrialPeriodDays() {
        return trialPeriodDays;
    }
    
    public void setTrialPeriodDays(String trialPeriodDays) {
        this.trialPeriodDays = trialPeriodDays;
    }
  
  @Override
  public String toString() {
    return "PlansEntity{" +
            "id='" + id + '\'' +
            ", object='" + object + '\'' +
            ", active=" + active +
            ", amount=" + amount +
            ", billingScheme='" + billingScheme + '\'' +
            ", created=" + created +
            ", currency='" + currency + '\'' +
            ", interval='" + interval + '\'' +
            ", intervalCount=" + intervalCount +
            ", nickname='" + nickname + '\'' +
            ", product='" + product + '\'' +
            ", trialPeriodDays='" + trialPeriodDays + '\'' +
            '}';
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
}
