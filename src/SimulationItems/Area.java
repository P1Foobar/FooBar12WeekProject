package SimulationItems;


import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Vector;

public class Area {

    Vector simobject;
    int rows;
    int columns;
    private Object Area;
        /*Uses rows and columns to form a grid. Objects will occupy squares. */
    Area (int rowsp, int columnsp)
    {
        rows = rowsp;
        columns = columnsp;
        simobject = new Vector();
    }

    public int numRows()
    {
        return rows;
    }

    public int numColumns()
    {
        return columns;
    }

    synchronized public void startObjects()
    {
        Enumeration els = simobject.elements ();

        while (els.hasMoreElements ()) {
            SimObject current = (SimObject) els.nextElement ();

            if (current.isPaused ()) {
                current.resumeObject ();
            } else {
                Thread simObjectThread = new Thread (current);
                simObjectThread.start();
            }
        }
    }

    synchronized public void pauseObjects ()
    {
        Enumeration els = simobject.elements ();

        while (els.hasMoreElements ()) {
            SimObject current = (SimObject) els.nextElement ();
            current.pauseObject();
        }
    }

    synchronized public void setObjectAt (int rows, int colu, Class objectClass)
    {
        if (objectClass != null) {
            try {
                SimObject newObject = (SimObject) objectClass.getDeclaredConstructor().newInstance();
                newObject.init (rows, colu, this);
                simobject.remove(getObjectAt(rows, colu));  //removes anything in a square when placing something new
                simobject.add(newObject);
            } catch (java.lang.InstantiationException e) {
                e.printStackTrace();
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }
        /*place objects at specific points in the grid*/
    synchronized public void setObjectAt (int row, int col, SimObject newObject)
    {
        newObject.init (row, col, Area this);
        simobject.remove(getObjectAt(row, col));
        simobject.add(newObject);
    }

    synchronized public boolean isSquareEmpty (int row, int col) throws RuntimeException
    {
        return (getObjectAt (row, col) == null);
    }

    public boolean validLocation (int row, int col) //check to see if the row/col combo is within the bounds
    {
        if((row < 0) || (row > numRows() - 1)) {
            return false;
        }

        if((col < 0) || (col > numColumns() - 1)) {
            return false;
        }

        return true;
    }

    /*uses row/col to locate objects for selection */
    public SimObject grabObjectAt (int row, int col) throws RuntimeException
    {
        if ((row < 0) || (row > numRows () - 1)) {
            throw new RuntimeException ("Bad row parameter for getObjectAt: " + row);
        }

        if ((col < 0) || (col > numColumns () - 1)) {
            throw new RuntimeException ("Bad column parameter for getObjectAt: " + col);
        }

        Enumeration els = simobject.elements ();

        while (els.hasMoreElements ()) {
            SimObject current = (SimObject) els.nextElement ();

            if ((current.getRow() == row) && (current.getColumn() == col))
            {
                return current;
            }
        }

        return null;
    }

    synchronized public SimObject getObjectAt (int row, int col) throws RuntimeException
    {
        return grabObjectAt (row, col);
    }

    synchronized public void clearGrid() { //clears the grid
        for (int i = 0; i < numRows(); i++) {
            for (int j = 0; j < numColumns(); j++) {
                simobject.remove(getObjectAt(i, j));
            }
        }
    }
}