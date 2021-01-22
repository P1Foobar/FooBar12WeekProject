package SimulationItems;

import java.util.Random;
import java.awt.Color;

//A MobileSimObject is a SimObject that can move.

abstract public class MobileSimObject extends SimObject {

    public  void setLocation (int newrow, int newcol)

    //sets this SimObject's location to newrow, newcol.
    {
        if (grid.getObjectAt (newrow, newcol) != null) {
            throw new RuntimeException ("BUG: SimObject.setLocation - row: " + newrow + " col: " + newcol + " already occupied.");
        }

        // Empty location, move to it
        rowp = newrow;
        colp = newcol;
    }
}
