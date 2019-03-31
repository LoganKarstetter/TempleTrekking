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
     * Enumerations corresponding to a bit position of
     * array index for entity stats. Do not add more
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
}


