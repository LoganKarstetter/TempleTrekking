package Entity;

import java.awt.Rectangle;

/**
 * File: Entity<br>
 * Desc: Represents movable named entities within the world.<br>
 * Date: Tues, April 2nd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class DynamicEntity extends Entity
{
    /** Name of entity */
    private String name;
    /** Pixels moved per update */
    private byte speed;

    /**
     * Create a named, movable DynamicEntity.
     * @param entityId - Unique id.
     * @param entityDim - Describes dimensions.
     * @param entityName - Name of entity.
     * @param entitySpeed - Move speed, zero if stationary.
     */
    public DynamicEntity(short entityId, Rectangle entityDim, String entityName, byte entitySpeed)
    {
        super(entityId, entityDim);

        name = entityName;
        speed = entitySpeed;
        type = (byte) EntityTypes.Type.DYNMC.ordinal();
    }

    public DynamicEntity(short entityId, Rectangle entityDim, String entityName)
    {
        this(entityId, entityDim, entityName, (byte) 0);
    }
}
