package Entity;

/**
 * File: EntityTypes<br>
 * Desc: Contains enumerations for entity classes.<br>
 * Date: Sat, March 30th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class EntityTypes
{
    /** The maximum/total amount of health possible  */
    public static final byte MAX_HEALTH = 100;

    /**
     * Enumerations corresponding to a bit position
     * or array index for the health stat of an entity.
     * This enum is designed to fit a byte.
     */
    public enum Health
    {
        CURR,      /* 0 */
        TOTAL,     /* 1 */
        NUM_HEALTH
    }

    /**
     * Enumerations corresponding to array indexes
     * for the state of an entity. This enum is
     * does not need to be restricted to a byte.
     */
    public enum State
    {
        IDLE,      /* 0 */
        NUM_STATE
    }

    /**
     * Enumerations corresponding to a bit position
     * or array index for the type of entity.
     * This enum is designed to fit a byte.
     */
    public enum Type
    {
        NONE,      /* 0 */
        NUM_TYPE
    }
}


