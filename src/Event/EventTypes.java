package Event;

/**
 * File: EventTypes<br>
 * Desc: Contains enumerations for event ids.<br>
 * Date: Thurs, April 4th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class EventTypes
{

    /**
     * Enumerations corresponding to an array index
     * for the id of an event.
     */
    public enum Id
    {
        NONE,      /* 0 */
        TALK,      /* 1 */
        SHOP,      /* 2 */
        ATTACK,    /* 3 */
        OPEN,      /* 4 */
        GATHER,    /* 5 */
        TAKE,      /* 6 */
        EAT,       /* 7 */
        DROP,      /* 8 */
        EQUIP,     /* 9 */
        NUM_ID
    }

    /**
     * Enumerations corresponding to a bit position
     * or array index for the target of an event item.
     * This enum is designed to fit a byte.
     */
    public enum Target
    {
        NONE,      /* 0 */
        ENTITY,    /* 1 */
        ITEM,      /* 2 */
        OBJECT,    /* 3 */
        NUM_TYPE
    }
}
