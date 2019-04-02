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
    protected short id;
    /** Item name */
    protected String name;
    /** Item description */
    protected String desc;
    /** Describes item type via ItemType.Type */
    protected byte type;
    /** Describes item rarity via ItemType.Rarity */
    protected byte rarity;

    /**
     * Create an interact-able game item. Items are found
     * either in the player's inventory or in the world.
     * Items cannot be worn, see WornItem.
     * @param itemId - Unique item id.
     * @param itemName - Item name.
     * @param itemDesc - Item description.
     * @param rarityValue - Rarity value index (ItemType.Rarity).
     */
    public Item(short itemId, String itemName, String itemDesc, byte rarityValue)
    {
        id = itemId;
        name = itemName;
        desc = itemDesc;
        type = (byte) ItemType.Type.NONE.ordinal();
        rarity = rarityValue;
    }
}

