package World;

import java.awt.image.BufferedImage;

/**
 * File: ItemManager<br>
 * Desc: Controls world object access and stores definitions.<br>
 * Date: Tues, April 2nd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class WorldObjectManager
{
    /** Max number of unique object definitions */
    private static final short OBJECT_CAPACITY = 256;

    /** Array of every object, access by id */
    private WorldObject[] objects;
    /** Corresponding images for objects, access by object id */
    private BufferedImage[] itemImages;


    public WorldObjectManager()
    {
        //Initialize arrays
        objects = new WorldObject[OBJECT_CAPACITY];
        itemImages = new BufferedImage[OBJECT_CAPACITY];
    }
}
