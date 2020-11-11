import java.util.*;

public class ItemTracker {
    private HashMap<String, Item> items;

    public ItemTracker() {
        items = new HashMap<>();
    }

    public void getItemByLabel(String label) {
        if(items.containsKey(label)) {
            System.out.println("No such key");
        } else {
            items.get(label);
        }
    }

    public void getAllItems() {
        for(String item : items.keySet()){
            System.out.println("Navn: " + items.get(item).getLabel()); 
            System.out.println("Dato: " + items.get(item).getDate());
            System.out.println("Beskrivelse: " + items.get(item).getDescription());
            System.out.println("Placering: " + items.get(item).getPlacement());
            System.out.println();
        }
    }

    public void addItem(String label, String description, String placement) {
        items.put(label, new Item(label, description, placement));
    }

    public void removeItem(String label) {
        items.remove(label);
    }
}
