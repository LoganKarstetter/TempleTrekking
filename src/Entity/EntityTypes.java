package Entity;

/**
 * File: EntityTypes<br>
 * Desc: Contains enumerations for entity classes.<br>
 * Date: Sat, March 30th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class EntityTypes
{
    /**
     * Enumerations corresponding to a bit position
     * or array index for the type of entity.
     * This enum is designed to fit a byte.
     */
    public enum Type
    {
        NONE,      /* 0 */
        DYNMC,     /* 1 */
        LIVING,    /* 2 */
        NUM_TYPE
    }

    /**
     * Enumerations corresponding to a bit position
     * or array index for the health stat of entity.
     * This enum is designed to fit a byte.
     */
    public enum Health
    {
        CURR,      /* 0 */
        TOTAL,     /* 1 */
        NUM_HEALTH
    }
}


