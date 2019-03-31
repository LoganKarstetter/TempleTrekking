package Main;

import javax.swing.*;
import java.awt.*;

/**
 * File: MainPanel<br>
 * Desc: Main panel is contained within the Launcher frame and periodically updates and draws game elements.<br>
 * Date: Sat, March 30th, 2019<br>
 * Auth: Logan Karstetter<br>
 */
public class MainPanel extends JPanel implements Runnable
{
    /** Main panel width (px) */
    private static short WIDTH;
    /** Main panel height (px) */
    private static short HEIGHT;

    /** Thread that runs the game */
    private Thread gameThread;
    /** Time taken to complete one loop cycle (ns) */
    private long loopTime;
    /** Flags whether the gameThread is running */
    private boolean isRunning;
    /** Double buffers / renders the screen */
    private Graphics dbGFX;
    /** Image constructed and drawn to the screen by dbGFX */
    private Image dbImage;

    /**
     * Creates a Main Panel and starts the game loop.
     * @param fps - The desired FPS/UPS.
     */
    public MainPanel(short fps)
    {
        //Calculate estimated loop time (1 sec (ns) / fps)
        loopTime = 1000000000/fps;

        //Set panel data
        setBackground(Color.BLACK);
        setDoubleBuffered(false);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
    }

    /**
     * Notifies the MainPanel it now belongs to a parent component
     * (the launcher frame). Once notified, it spawns the gameThread
     * and starts the game. These actions prevent the game from
     * starting before the window is visible to the user.
     */
    @Override
    public void addNotify()
    {
        super.addNotify();
        if (gameThread == null || !isRunning)
        {
            gameThread = new Thread(this);
            gameThread.start();
        }
    }

    /**
     * Draw the created dbImage to the screen.
     */
    private void paintScreen()
    {
        try
        {
            //Retrieve graphics context
            Graphics graphics = this.getGraphics();

            //Draw double buffered image to the panel
            if ((graphics != null) && (dbImage != null))
            {
                graphics.drawImage(dbImage, 0, 0, null);
            }
            Toolkit.getDefaultToolkit().sync(); //Sync display (linux thing?)
            graphics.dispose();
        }
        catch (NullPointerException exception)
        {
            System.out.println("Graphics context error");
            exception.printStackTrace();
        }
    }

    /**
     * Render game elements via double buffering. If not done already, creates
     * a blank image the size of the panel and constructs / draws to it offscreen.
     * Once the image is complete, paintScreen() draws it to the screen. This
     * process prevents flickering as the screen's image is pieced together.
     */
    private void renderGame()
    {
        //If the double buffered image is null, define it
        if (dbImage == null)
        {
            //Create double buffered image
            dbImage = createImage(WIDTH, HEIGHT);
            if (dbImage != null)
            {
                //Fetch the image graphics context to enable drawing
                dbGFX = dbImage.getGraphics();
            }
            else { return; }
        }

        //Draw the background and game
        dbGFX.setColor(Color.BLACK);
        dbGFX.fillRect(0, 0, WIDTH, HEIGHT);
        //game.draw(dbGFX);
    }

    /**
     * Every ~loopTime (ns), this method updates the game elements,
     * renders the elements into an image, draws that image to the
     * panel, and sleeps for a calculated amount of time. This is
     * main game loop.
     */
    @Override
    public void run()
    {
        long timeBeforeLoop; //The time measured before the game methods are called
        long timeAfterLoop;  //The time measured after the game methods complete
        long timeDifference; //The time taken to complete run the methods (timeAfterLoop - timeBeforeLoop)

        long overtime = 0L;      //The excess time taken to complete the loop (actual - loopPeriod)
        long timeToSleep = 0L;   //Time left for sleeping to maintain fps (loopPeriod - timeDifference) - timeOverslept
        long timeOverslept = 0L; //The amount of time the thread overslept

        int numDelays = 0;                 //The number of times the thread has looped without sleeping
        int numFramesSkipped = 0;          //The number of times the thread has skipped rendering due to running overtime
        int numDelaysBeforeYield = 16;     //Number of times the thread can loop with sleep < 0 before yielding to other threads
        int framesSkippedBeforeRender = 5; //Number of frames can skip rendering before it is forced to do so

        //Record timeBeforeLoop before the loop begins
        timeBeforeLoop = System.nanoTime();
        isRunning = true;
        while (isRunning)
        {
            //Update, render, paint
            updateGame();
            renderGame();
            paintScreen();

            //Record time taken for game methods
            timeAfterLoop = System.nanoTime();
            timeDifference = (timeAfterLoop - timeBeforeLoop);

            //Calculate required sleep time to maintain fps
            timeToSleep = (loopTime - timeDifference) - timeOverslept;
            if (timeToSleep > 0)
            {
                try
                {
                    //Convert timeToSleep to milliseconds
                    Thread.sleep(timeToSleep/1000000);
                }
                catch (InterruptedException exception) { /* Do nothing */ }
            }
            else
            {
                //Record overtime and clear timeOverslept
                overtime = overtime - timeToSleep;
                timeOverslept = 0L;

                //Increment delays and check for yield condition
                if (++numDelays >= numDelaysBeforeYield)
                {
                    Thread.yield();
                    numDelays = 0;
                }
            }

            //Record the time before the next loop starts
            timeBeforeLoop = System.nanoTime();

            //Force an update if rendering is consuming too much of the loop period to maintain ups
            numFramesSkipped = 0;
            while ((overtime > loopTime) && (numFramesSkipped < framesSkippedBeforeRender))
            {
                overtime = overtime - loopTime;
                updateGame();
                numFramesSkipped++;
            }
        }
        System.exit(0);
    }

    /**
     * Update the game elements.
     */
    private void updateGame()
    {
        //game.update(loopTime);
    }
}
