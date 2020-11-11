import java.time.Instant;

public class Item {
    String label;
    String description;
    String placement;
    long timestamp;

    public Item(String label, String description, String placement){
        setLabel(label);
        setDescription(description);
        setPlacement(placement);
        this.timestamp = Instant.now().getEpochSecond();
    }
    public Item(String label, String placement){
        setLabel(label);
        setDescription("No description");
        setPlacement(placement);
        this.timestamp = Instant.now().getEpochSecond();
    }

    /* SET METHODS */
    public void setLabel(String label){
        this.label = label;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPlacement(String placement){
        this.placement = placement;
    }

    /* GET METHODS */
    public String getLabel(){
        return this.label;
    }
    public String getDescripttion(){
        return this.description;
    }
    public String getPlacement(){
        return this.placement;
    }


}
