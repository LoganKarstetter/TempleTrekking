package Event;

/**
 * File: Event<br>
 * Desc: Represents player or game driven events
 *       that have an outcome such as opening a
 *       door or opening an NPC dialogue.<br>
 * Date: Thurs, April 4th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class Event
{
    /** Unique event id, see EventTypes.Id */
    private byte id;
    /** Unique target id. */
    private short targetId;
    /** Target type, see EventTypes.Target */
    private byte targetType;

    /**
     * Create a new event to be triggered and processed.
     * @param eventId - Unique event id.
     * @param targetId - Id of target relative to type.
     * @param targetType - Type of target, see EventTypes.Target.
     */
    public Event(byte eventId, short targetId, byte targetType)
    {
        id = eventId;
        this.targetId = targetId;
        this.targetType = targetType;
    }
}
