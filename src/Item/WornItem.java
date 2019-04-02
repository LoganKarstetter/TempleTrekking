package Item;

public class WornItem extends Item
{
    /** The number of stats tied to a worn item */
    private static final byte NUM_STATS = 6;

    /** Describes worn slot via ItemType.Worn */
    private byte worn;
    /** Array of stats, access via ItemType.Stat */
    private byte[] stats;

    /**
     * Create a WornItem with base (0) stats.
     * @param itemId - Unique item id.
     * @param itemName - Item name.
     * @param itemDesc - Item description.
     * @param wornSlot - Worn value index (ItemType.Worn).
     * @param rarityValue - Rarity value index (ItemType.Rarity).
     */
    public WornItem(short itemId, String itemName, String itemDesc, byte wornSlot, byte rarityValue)
    {
        super(itemId, itemName, itemDesc, rarityValue);

        //All zero stats by default (that's how an array works)
        worn = wornSlot;
        stats = new byte[NUM_STATS];
        type = (byte) ItemType.Type.WEAR.ordinal();
    }

    /**
     * Create a WornItem with predetermined stats.
     * @param itemId - Unique item id.
     * @param itemName - Item name.
     * @param itemDesc - Item description.
     * @param wornSlot - Worn value index (ItemType.Worn).
     * @param rarityValue - Rarity value index (ItemType.Rarity).
     */
    public WornItem(short itemId, String itemName, String itemDesc, byte wornSlot, byte rarityValue, byte[] itemStats)
    {
        super(itemId, itemName, itemDesc, rarityValue);

        worn = wornSlot;
        stats = itemStats;
        type = (byte) ItemType.Type.WEAR.ordinal();
    }

    //TODO: Transfer stats on equip
}
