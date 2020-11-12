package item.tracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTrackerTest {
    ItemTracker itemTracker;

    @BeforeEach
    public void setUp(){
        itemTracker = new ItemTracker();
    }
    @Test
    public void addItem(){
        itemTracker.addItem("Doja Cat", "Doja Cat's nyeste album", "På væggen over sofaen");
        assertEquals("Doja Cat's nyeste album", itemTracker.getItemByLabel("Doja Cat").getDescription());
    }
    @Test
    public void removeItem(){
        itemTracker.addItem("Doja Cat", "Doja Cat's nyeste album", "På væggen over sofaen");
        itemTracker.removeItem("Doja Cat");
        assertNull(itemTracker.getItemByLabel("Doja Cat"));
    }
}
