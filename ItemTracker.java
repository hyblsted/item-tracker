import java.util.*;

/*
** Class: ItemTracker
** --Fields:
** HashMap<String, Item> items
** --Methods
** getItemByLabel()
** getAllItems()
** addItem()
** removeItem()
*/

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
        System.out.println(items);
    }

    public void addItem(String label, String description, String placement) {
        items.put(label, new Item(label, description, placement));
    }

    public void removeItem(String label) {
        items.remove(label);
    }
}
