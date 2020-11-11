public class Main{
    public static void main(String[] args) {
        System.out.println("Item tracker running ...");
        System.out.println();
    }
}

/*
** PROGRAM SHOULD HAVE
**
** --Class: Item
** --Fields:
** String label
** String description
** String placement
** int timestamp
** --Contructor(String label, String description, String placement)
** sets all fields + timestamp
** --Methods:
** getLabel()
** getDescription()
** getPlacement()
** getDate()
** setLabel()
** setDescription()
** setPlacement()

** Class: ItemTracker
** --Fields:
** HashMap<String, Item> items
** --Methods
** getItemByLabel()
** getAllItems()
** addItem()
** removeItem()
*/