package Object;

import java.awt.image.BufferedImage;

/**
 * File: ObjectManager<br>
 * Desc: Controls object access and stores definitions.<br>
 * Date: Wed, April 3rd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class ObjectManager
{
    /** Array of every object, access by id */
    private Object[] objects;
    /** Corresponding images for objects, access by object id */
    private BufferedImage[] objectImages;

    /**
     * Create an ObjectManager for creating and controlling
     * Object definitions and access.
     */
    public ObjectManager()
    {
        //Initialize arrays
        objects = new Object[ObjectTypes.OBJECT_CAPACITY];
        objectImages = new BufferedImage[ObjectTypes.OBJECT_CAPACITY];
    }
}
