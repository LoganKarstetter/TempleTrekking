package Entity;

import Item.ItemTypes;

/**
 * File: Entity<br>
 * Desc: Represents NPCs, enemies, creatures, etc.<br>
 * Date: Wed, April 3rd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class Entity
{
    /** The number of entity stats excluding health */
    private static final byte NUM_STATS = (byte) ItemTypes.Stat.NUM_STAT.ordinal();
    /** The number of equipment worn slots */
    private static final byte NUM_WORN = (byte) ItemTypes.Worn.NUM_WORN.ordinal();

    /** Unique entity id */
    private short id;
    /** Describes entity type via EntityTypes.Type */
    private byte type;
    /** Name of entity */
    private String name;
    /** Pixels moved per update */
    private byte speed;
    /** Stats gathered from equipment, see ItemTypes.Stat */
    private byte[] stats;
    /** Equipment slots (filled/empty), see ItemTypes.Worn */
    private byte worn;
    /** Worn item ids matching worn slots */
    private byte[] equipment;

    /**
     * Create an Entity. Entities represent NPCs, enemies, and
     * other moving "living" beings within the game world.
     * @param entityId - Unique id.
     * @param entityName - Name of entity.
     * @param entitySpeed - Move speed, zero if stationary.
     * @param entityEquipment - Worn equipment to derive stats and appearance from.
     */
    public Entity(short entityId, String entityName, byte entitySpeed, byte[] entityEquipment )
    {
        id = entityId;
        name = entityName;
        speed = entitySpeed;
        equipment = entityEquipment;
        type = (byte) EntityTypes.Type.NONE.ordinal();

        stats = new byte[NUM_STATS];
        //TODO: Derive stats from equipment
    }
}
