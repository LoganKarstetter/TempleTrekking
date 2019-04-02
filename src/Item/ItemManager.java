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
    /** Max number of unique item definitions */
    private static final short ITEM_CAPACITY = 256;

    /** Array of every item, access by id */
    private Item[] items;
    /** Corresponding images for items, access by item id */
    private BufferedImage[] itemImages;


    public ItemManager()
    {
        //Initialize arrays
        items = new Item[ITEM_CAPACITY];
        itemImages = new BufferedImage[ITEM_CAPACITY];
    }
}
