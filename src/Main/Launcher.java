package Main;
import javax.swing.*;

/**
 * File: Launcher<br>
 * Desc: Entry point for the game.<br>
 * Date: Sat, March 30th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class Launcher extends JFrame
{
    /** The FPS/UPS for Temple Trekking */
    private static byte fps = 60;

    /**
     * Create a launcher for playing Temple Trekking.
     */
    public Launcher()
    {
        //Spawn the game
        MainPanel mainPanel = new MainPanel(fps);
        getContentPane().add(mainPanel);

        //Disable resizability
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        //Automatically set size based on components
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * Main method, launch Temple Trekking.
     * @param args - None.
     */
    public static void main(String[] args)
    {
        System.out.println("Starting Temple Trekking.");
        new Launcher();
    }
}
