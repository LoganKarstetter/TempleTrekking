package Entity;

import Item.ItemTypes;

import java.awt.Rectangle;

/**
 * File: LivingEntity<br>
 * Desc: Represents life/death capable entities with stats and equipment.<br>
 * Date: Tues, April 2nd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class LivingEntity extends DynamicEntity
{
    /** The number of entity stats excluding health */
    private static final byte NUM_STATS = (byte) ItemTypes.Stat.NUM_STAT.ordinal();
    /** The number of equipment worn slots */
    private static final byte NUM_WORN = (byte) ItemTypes.Worn.NUM_WORN.ordinal();
    /** The number of entity health stats  */
    private static final byte NUM_HEALTH = (byte) EntityTypes.Health.NUM_HEALTH.ordinal();
    /** The maximum/total amount of health possible  */
    private static final byte MAX_HEALTH = 100; //TODO: Move to EntityTypes?

    /** Health, current and total, see EntityTypes.Health */
    private byte[] health;
    /** Stats gathered from equipment, see ItemTypes.Stat */
    private byte[] stats;
    /** Equipment slots (filled/empty), see ItemTypes.Worn */
    private byte worn;
    /** Worn item ids matching worn slots */
    private byte[] equipment;
    /** Entity state, see EntityTypes.State */
    private byte state; //TODO: Define states

    /**
     * Create an entity capable of life and death, with stats and equipment.
     * LivingEntities represent basic NPCs that are incapable of combat.
     * @param entityId - Unique id.
     * @param entityDim - Describes dimensions.
     * @param entityName - Name of entity.
     * @param entitySpeed - Move speed, zero if stationary.
     * @param entityEquipment - Worn equipment to derive stats from.
     */
    public LivingEntity(short entityId, Rectangle entityDim, String entityName, byte entitySpeed, byte[] entityEquipment )
    {
        super(entityId, entityDim, entityName, entitySpeed);

        health = new byte[NUM_HEALTH];
        health[EntityTypes.Health.CURR.ordinal()] = MAX_HEALTH;
        health[EntityTypes.Health.TOTAL.ordinal()] = MAX_HEALTH;

        //TODO: Determine worn and stats
        stats = new byte[NUM_STATS];
        equipment = entityEquipment;
        type = (byte) EntityTypes.Type.LIVING.ordinal();
    }
}
