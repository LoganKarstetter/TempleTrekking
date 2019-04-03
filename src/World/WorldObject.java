package World;

import java.awt.Rectangle;

/**
 * File: WorldObject<br>
 * Desc: Represents basic objects found within the world.<br>
 * Date: Mon, April 1st, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class WorldObject
{
    /** Unique object id */
    private short objectId;
    /** Describes object size and pos */
    private Rectangle boundingBox;
    /** Describes object type via WorldType.Type */
    private byte type;

    /**
     * Create a WorldObject. WorldObjects are found within
     * the game world and may represent physical objects or
     * invisible barriers.
     * @param worldObjectId - Unique object id.
     * @param objectBox - Rectangle representing size and position.
     */
    public WorldObject(short worldObjectId, Rectangle objectBox )
    {
        objectId = worldObjectId;
        boundingBox = objectBox;
        type = (byte) WorldTypes.Type.NONE.ordinal();
    }

}
