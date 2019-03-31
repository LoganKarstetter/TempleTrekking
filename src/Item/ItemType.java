package Item;
/**
 * File: ItemTypes<br>
 * Desc: Contains enumerations for item classes.<br>
 * Date: Sat, March 30th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class ItemType
{
    /**
     * Enumerations corresponding to a bit position
     * or array index for the rarity of an item. This enum is
     * designed to fit a byte, don't add more.
     */
    public enum Rarity
    {
        COMMON,    /* 0 */
        UNCOMMON,  /* 1 */
        RARE,      /* 2 */
        LEGENDARY, /* 3 */
        EXOTIC,    /* 4 */
        NUM_RARITY
    }

    /**
     * Enumerations corresponding to a bit position
     * or array index for worn items. This enum is
     * designed to fit a byte, don't add more.
     */
    public enum Worn
    {
        HEAD, /* 0 */
        BODY, /* 1 */
        LEGS, /* 2 */
        BACK, /* 3 */
        WEAP, /* 4 */
        SHLD, /* 5 */
        AMMY, /* 6 */
        RING, /* 7 */
        NUM_WORN
    }
}
