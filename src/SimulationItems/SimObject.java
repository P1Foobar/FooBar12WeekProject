package SimulationItems;

import java.util.Random;
import java.util.Enumeration;
import java.util.Vector;
import java.awt.Color;

/* establishes base objects and properties
that we can extend to create different kinds of people*/

abstract public class SimObject implements Runnable {

    protected Area grid;
    protected int rowp;
    protected int colp;

    private boolean isPaused;

    private Random random;

    static final int TURN_DELAY = 500;
    static final int TURN_RANDOM = 200;

    public SimObject ()
    {
        random = new Random();
    }

    final public void init (int row, int col, Area grid)
    {
        this.rowp = row;
        this.colp = col;
        this.grid = grid;
        this.isPaused = false;
    }

    public void run ()
    {
        isPaused = false;

        while (true) {
            if (!isPaused) {
                executeTurn ();
                delay (TURN_DELAY + random.nextInt(TURN_RANDOM));
            }
        }
    }
    /*Basic properties for the objects to respond to user pause/play */
    public void resumeObject()
    {
        isPaused = false;
    }

    public void pauseObject()
    {
        isPaused = true;
    }

    public boolean isPaused()
    {
        return isPaused;
    }

    abstract public void executeTurn();

    public Color getColor ()
    {
        return Color.green;
    }

    final public int getRow ()
    {
        return rowp;
    }

    final public void delay (int ms)
    {
        try {
            Thread.sleep (ms);
        } catch (InterruptedException ie) {
            ;
        }
    }

    final public int getColumn ()
    {
        return colp;
    }
    /* objects have interaction with neighboring grid squares
    * allows for the virus to spread*/

    synchronized public Enumeration getNeighbors () {

        Vector objects = new Vector ();

        for (int row = rowp - 1; row <= rowp + 1; row++) {
            for (int col = colp - 1; col <= colp + 1; col++) {
                if (row != rowp || col != colp) {
                    if (grid.validLocation (row, col)) {
                        SimObject obj = grid.getObjectAt (row, col);

                        if (obj != null) {
                            objects.addElement (obj);
                        }
                    }
                }
            }
        }

        return objects.elements ();
    }

    final public Area getGrid ()
    {
        return grid;
    }

}
