package Item;

import java.awt.image.BufferedImage;

/**
 * File: ItemManager<br>
 * Desc: Controls item access and stores definitions.<br>
 * Date: Mon, April 1st, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class ItemManager
{
    /** Array of every item, access by id */
    private Item[] items;
    /** Corresponding images for items, access by item id */
    private BufferedImage[] itemImages;

    /**
     * Create an ItemManager for creating and controlling
     * Item definitions and access.
     */
    public ItemManager()
    {
        //Initialize arrays
        items = new Item[ItemTypes.ITEM_CAPACITY];
        itemImages = new BufferedImage[ItemTypes.ITEM_CAPACITY];
    }
}
