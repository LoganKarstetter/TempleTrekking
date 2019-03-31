package IO;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

/**
 * File: KeyboardListener<br>
 * Desc: Listens for and flags user keyboard inputs.<br>
 * Date: Sat, March 30th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class KeyboardListener implements KeyListener
{
    /** Maps key codes to booleans to indicate pressed keys */
    private HashMap<Integer, Boolean> keyMap;

    /** Flag specifying W/UP was pressed */
    public boolean up;
    /** Flag specifying A/LEFT was pressed */
    public boolean left;
    /** Flag specifying S/DOWN was pressed */
    public boolean down;
    /** Flag specifying D/RIGHT was pressed */
    public boolean right;

    /**
     * Creates a new KeyboardListener to flag
     * arrow key and WASD user inputs.
     */
    public KeyboardListener()
    {
        keyMap = new HashMap<>();

        //Map WASD
        keyMap.put(KeyEvent.VK_W, false);
        keyMap.put(KeyEvent.VK_A, false);
        keyMap.put(KeyEvent.VK_S, false);
        keyMap.put(KeyEvent.VK_D, false);

        //Map arrow keys
        keyMap.put(KeyEvent.VK_UP, false);
        keyMap.put(KeyEvent.VK_LEFT, false);
        keyMap.put(KeyEvent.VK_DOWN, false);
        keyMap.put(KeyEvent.VK_RIGHT, false);
    }

    /**
     * Update the pressed key booleans.
     */
    public void update()
    {
        //Update booleans, OR together keys sharing the same direction
        up    = (keyMap.get(KeyEvent.VK_W) || keyMap.get(KeyEvent.VK_UP));
        left  = (keyMap.get(KeyEvent.VK_A) || keyMap.get(KeyEvent.VK_LEFT));
        down  = (keyMap.get(KeyEvent.VK_S) || keyMap.get(KeyEvent.VK_DOWN));
        right = (keyMap.get(KeyEvent.VK_D) || keyMap.get(KeyEvent.VK_RIGHT));
    }

    /**
     * Maps true to a key code when the key is pressed.
     * @param event The key event.
     */
    @Override
    public void keyPressed(KeyEvent event)
    {
        keyMap.replace(event.getKeyCode(), true);
    }

    /**
     * Maps false to a key code when the key is released.
     * @param event The key event.
     */
    @Override
    public void keyReleased(KeyEvent event)
    {
        keyMap.replace(event.getKeyCode(), false);
    }

    /**
     * This method does nothing and is not used.
     * */
    @Override
    public void keyTyped(KeyEvent event) { /* Do nothing */ }
}
