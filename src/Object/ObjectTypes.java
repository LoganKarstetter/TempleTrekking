package Object;

/**
 * File: ObjectTypes<br>
 * Desc: Contains enumerations for object classes.<br>
 * Date: Wed, April 3rd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class ObjectTypes
{
    /** Max number of unique object definitions */
    protected static final short OBJECT_CAPACITY = 256;

    /**
     * Enumerations corresponding to a bit position
     * or array index for the type of object.
     * This enum is designed to fit a byte.
     */
    public enum Type
    {
        NONE,      /* 0 */
        NUM_TYPE
    }
}
