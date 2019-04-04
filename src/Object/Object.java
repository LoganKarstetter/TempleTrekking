package Object;

/**
 * File: Object<br>
 * Desc: Represents basic objects found within the world.<br>
 * Date: Wed, April 3rd, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class Object
{
    /** Unique object id */
    private short id;
    /** Describes object type via ObjectTypes.Type */
    private byte type;

    /**
     * Create an interact-able game object. Objects are
     * the scenery, terrain, resources etc. in the world.
     * @param objectId - Unique object id.
     */
    public Object(short objectId)
    {
        id = objectId;
        type = (byte) ObjectTypes.Type.NONE.ordinal();
    }
}
