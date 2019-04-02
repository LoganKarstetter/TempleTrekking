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
     * or array index for the type of item. This enum is
     * designed to fit a byte.
     */
    public enum Type
    {
        NONE,      /* 0 */
        WEAR,      /* 1 */
        NUM_TYPE
    }

    /**
     * Enumerations corresponding to a bit position of
     * array index for item stats. Do not add more
     * than 7 enums or this will be unable to suit a byte.
     */
    public enum Stat
    {
        MELEE_ATT, /* 0 */
        MELEE_DEF, /* 1 */
        RANGE_ATT, /* 2 */
        RANGE_DEF, /* 3 */
        MAGIC_ATT, /* 4 */
        MAGIC_DEF, /* 5 */
        NUM_STAT
    }

    /**
     * Enumerations corresponding to a bit position
     * or array index for the rarity of an item. This enum is
     * designed to fit a byte.
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
