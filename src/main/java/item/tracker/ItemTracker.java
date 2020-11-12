package item.tracker;

import java.util.*;

public class ItemTracker {
    private HashMap<String, Item> items;

    public ItemTracker() {
        items = new HashMap<>();
    }

    public Item getItemByLabel(String label) {
        if(items.containsKey(label)) {
            return items.get(label);
        }else{
            System.out.println("No such item exists ...");
            return null;
        }
    }

    public void getAllItems() {
        if(items.size() == 0){
            System.out.println("There are no items in the item tracker ...");
        }else{
            for(String item : items.keySet()){
                System.out.println("Navn: " + items.get(item).getLabel()); 
                System.out.println("Dato: " + items.get(item).getDate());
                System.out.println("Beskrivelse: " + items.get(item).getDescription());
                System.out.println("Placering: " + items.get(item).getPlacement());
                System.out.println();
            }
        }
    }

    public void addItem(String label, String description, String placement) {
        items.put(label, new Item(label, description, placement));
    }

    public void removeItem(String label) {
        if(items.containsKey(label)){
            items.remove(label);
            System.out.println(label + " removed!");
        }else{
            System.out.println("No such item exists ...");
        }
    }
}
