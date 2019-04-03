package Entity;

import java.awt.Rectangle;

/**
 * File: Entity<br>
 * Desc: Represents basic entities within the world.<br>
 * Date: Tues, April 2nd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class Entity
{
    /** Unique entity id */
    protected short entityId;
    /** Represents entity size and pos */
    protected Rectangle boundingBox;
    /** Describes entity type via EntityTypes.Type */
    protected byte type;

    /**
     * Create an basic static Entity.
     * @param entityId - Unique id.
     * @param entityDim - Describes dimensions.
     */
    public Entity(short entityId, Rectangle entityDim )
    {
        this.entityId = entityId;
        boundingBox = entityDim;
        type = (byte) EntityTypes.Type.NONE.ordinal();
    }

}
