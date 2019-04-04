package World;

import Entity.EntityTypes;

import java.awt.Rectangle;

/**
 * File: WorldEntity<br>
 * Desc: Wrapper for entities found in the game world.<br>
 * Date: Wed, April 3rd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class WorldEntity
{
    /** The number of entity health stats  */
    private static final byte NUM_HEALTH = (byte) EntityTypes.Health.NUM_HEALTH.ordinal();

    /** Unique entity id */
    private short entityId;
    /** Describes size and position */
    private Rectangle boundingBox;
    /** Health, current and total, see EntityTypes.Health */
    private byte[] health;
    /** Entity state, see EntityTypes.State */
    private byte state;
    //TODO: Add direction

    /**
     * Create an Entity that exists within the game world.
     * @param entityId - Id of wrapped entity.
     * @param entityDim - Describes size and position of an entity.
     */
    public WorldEntity(short entityId, Rectangle entityDim)
    {
        this.entityId = entityId;
        boundingBox = entityDim;
        state = (byte) EntityTypes.State.IDLE.ordinal();

        health = new byte[NUM_HEALTH];
        health[EntityTypes.Health.CURR.ordinal()] = EntityTypes.MAX_HEALTH;
        health[EntityTypes.Health.TOTAL.ordinal()] = EntityTypes.MAX_HEALTH;
    }
}
