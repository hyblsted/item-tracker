package item.tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemTracker items = new ItemTracker();
        System.out.println("Item tracker running ...");
        System.out.println();
        System.out.println("Commands:");
        System.out.println("quit - Quits program");
        System.out.println("see items - Lists all items");
        System.out.println("get item - See a specific item");
        System.out.println("add item - Add an item");
        System.out.println("remove item - Remove an item");
        System.out.println();

        Scanner in = new Scanner(System.in);
        
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.equals("quit")) break;
            if(line.equals("see items")) items.getAllItems();
            if(line.equals("add item")){
                System.out.println("What is the item label?");
                String label = in.nextLine();
                System.out.println("What is the item description?");
                String description = in.nextLine();
                System.out.println("What is the item placement");
                String placement = in.nextLine();
                items.addItem(label, description, placement);
                System.out.println("Item added!");
                System.out.println();
            }
            if(line.equals("remove item")){
                System.out.println("What item should be removed?");
                String label = in.nextLine();
                items.removeItem(label);
            }
            if(line.equals("get item")){
                System.out.println("What item should we get?");
                String label = in.nextLine();
                items.getItemByLabel(label);
            }
        }

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