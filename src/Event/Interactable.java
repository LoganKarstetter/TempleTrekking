package Event;

/**
 * File: Interactable<br>
 * Desc: Connects mouse inputs to events.<br>
 * Date: Thurs, April 4th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public abstract class Interactable
{
    /** Event triggered on left click, see EventTypes.Type */
    protected byte leftId;
    /** Event triggered on right click, see EventTypes.Type */
    protected byte rightId;

    /**
     * Queue an event triggered on an in-game target via left mouse click.
     */
    protected final void processLeftEvent()
    {

    }

    /**
     * Queue an event triggered on an in-game target via right mouse click.
     */
    protected final void processRightEvent()
    {

    }
}
