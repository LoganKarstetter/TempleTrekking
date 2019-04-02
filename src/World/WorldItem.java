package World;

/**
 * File: WorldItem<br>
 * Desc: Wrapper for items found in the game world.<br>
 * Date: Mon, April 1st, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class WorldItem
{
    /** Distance to the position to allow pickup */
    public static final byte PICKUP_RADIUS = 5;

    /** Id of wrapped item */
    private short itemId;
    /** Represents world position (x,y) */
    private WorldPoint pos;
    /** Respawn rate, de-spawn rate if negative (ms) */
    private float spawnRate;

    /**
     * Create an non-respawning, interact-able world item.
     * @param itemId - Id of wrapped item.
     * @param itemPos - World position relative to origin.
     */
    public WorldItem(short itemId, WorldPoint itemPos)
    {
        this.itemId = itemId;
        pos = itemPos;
        spawnRate = 0;
    }

    /**
     * Create an spawning, interact-able world item.
     * @param itemId - Id of wrapped item.
     * @param itemPos - World position relative to origin.
     * @param respawnRate - Respawn rate in ms.
     */
    public WorldItem(short itemId, WorldPoint itemPos, float respawnRate)
    {
        this.itemId = itemId;
        pos = itemPos;
        spawnRate = respawnRate;
    }
}
