package World;

/**
 * File: WorldPoint<br>
 * Desc: Custom point object using shorts.<br>
 * Date: Mon, April 1st, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class WorldPoint
{
    /** X-coordinate relative to world origin */
    private short x;
    /** Y-coordinate relative to world origin */
    private short y;

    /**
     * Create an empty WorldPoint (0,0).
     */
    public WorldPoint()
    {
        x = 0;
        y = 0;
    }

    /**
     * Create a WorldPoint with the passed coordinates.
     * @param xCoord - X coordinate relative to world origin.
     * @param yCoord - Y coordinate relative to world origin.
     */
    public WorldPoint(short xCoord, short yCoord)
    {
        x = xCoord;
        y = yCoord;
    }

    /**
     * Copy and existing WorldPoint into another.
     * @param copyPoint - The WorldPoint to copy.
     */
    public WorldPoint(WorldPoint copyPoint)
    {
        x = copyPoint.x;
        y = copyPoint.y;
    }

    /**
     * Retrieve the x-coordinate.
     * @return - X coordinate relative to world origin.
     */
    public short getX()
    {
        return x;
    }

    /**
     * Retrieve the y-coordinate.
     * @return - Y coordinate relative to world origin.
     */
    public short getY()
    {
        return y;
    }
}
