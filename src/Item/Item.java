package Item;

/**
 * File: Item<br>
 * Desc: Represents items in the game (stores, inventory, etc).<br>
 * Date: Sat, March 30th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class Item
{
    /** Unique item id */
    private short id;
    /** Describes worn slot via ItemType.Worn */
    private byte worn;
    /** Describes item rarity via ItemType.Rarity */
    private byte rarity;

    /**
     * Create an interact-able game item. Items are found
     * either in the player's inventory or worn equipment.
     * @param itemId - Unique item id.
     * @param wornSlot - Worn slot index (ItemType.Worn).
     * @param rarityValue - Rarity value index (ItemType.Rarity).
     */
    public Item(short itemId, byte wornSlot, byte rarityValue)
    {
        id = itemId;
        worn = wornSlot;
        rarity = rarityValue;
    }

    /**
     * Create an game item that cannot be equipped, but
     * can be used for other means.
     * @param itemId - Unique item id.
     * @param rarityValue - Rarity value index (ItemType.Rarity).
     */
    public Item(short itemId, byte rarityValue)
    {
        id = itemId;
        worn = (byte) ItemType.Worn.NUM_WORN.ordinal();
        rarity = rarityValue;
    }
}

