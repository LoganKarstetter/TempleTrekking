package World;

import java.awt.Rectangle;

/**
 * File: WorldObject<br>
 * Desc: Wrapper for objects found in the game world.<br>
 * Date: Wed, April 3rd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class WorldObject
{
    /** Unique entity id */
    private short objectId;
    /** Describes size and position */
    private Rectangle boundingBox;

    /**
     * Create an Object that exists within the game world.
     * @param objectId - Id of wrapped object.
     * @param objectDim - Describes size and position of an object.
     */
    public WorldObject(short objectId, Rectangle objectDim)
    {
        this.objectId = objectId;
        boundingBox = objectDim;
    }
}
