import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Item tracker running ...");
        System.out.println();
        //Scanner in = new Scanner(System.in);

        ItemTracker andersTing = new ItemTracker();
        andersTing.addItem("Dojocat", "den gode sang", "under sengen");
        andersTing.addItem("Dojocat2", "den gode sang", "under sengen");
        andersTing.getAllItems();
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