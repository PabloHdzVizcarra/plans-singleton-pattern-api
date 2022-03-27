package jvm.pablohdz.planssingletonpatternapi.dto;

public class DeleteResponse {
    private final String id;
    private final String object;
    private final Boolean deleted;
    
    public DeleteResponse(String id, String object, Boolean deleted) {
        this.id = id;
        this.object = object;
        this.deleted = deleted;
    }
    
    public String getId() {
        return id;
    }
    
    public String getObject() {
        return object;
    }
    
    public Boolean getDeleted() {
        return deleted;
    }
}
