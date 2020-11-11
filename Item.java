import java.time.Instant;

public class Item {
    String label;
    String description;
    String placement;
    Instant timeStamp;

    public Item(String label, String description, String placement){
        setLabel(label);
        setDescription(description);
        setPlacement(placement);
        this.timeStamp = Instant.now();
    }
    public Item(String label, String placement){
        setLabel(label);
        setDescription("No description");
        setPlacement(placement);
        this.timeStamp = Instant.now();
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
    public String getDescription(){
        return this.description;
    }
    public String getPlacement(){
        return this.placement;
    }
    public String getDate(){
        return this.timeStamp.toString();
    }

}
