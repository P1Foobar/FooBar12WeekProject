package SimulationItems;
import java.util.Random;

public class Direction {

    private int northsouth;
    private int eastwest;

    static final public Direction NORTH = new Direction (1, 0);
    static final public Direction NORTHEAST = new Direction (1, 1);
    static final public Direction EAST = new Direction (0, 1);
    static final public Direction SOUTHEAST = new Direction (-1, 1);
    static final public Direction SOUTH = new Direction (-1, 0);
    static final public Direction SOUTHWEST = new Direction (-1, -1);
    static final public Direction WEST = new Direction (0, -1);
    static final public Direction NORTHWEST = new Direction (1, -1);

    static private Random random = new Random ();

    public Direction (int ns, int ew)
    {
        northsouth = ns;
        eastwest = ew;
    }

    public String toString ()
    {
        String res;

        switch (northsouth)
        {
            case 1:  res = "north"; break;
            case -1: res = "south"; break;
            default: res = ""; break;
        }

        switch (eastwest)
        {
            case 1: res += "east"; break;
            case -1: res += "west"; break;
            default: break;
        }

        return res;
    }

    public int northerlyDirection () {
        return northsouth;
    }

    public int easterlyDirection () {
        return eastwest;
    }

    static public Direction randomDirection () {
        int dir = random.nextInt (8);

        switch (dir) {
            case 0: return NORTH;
            case 1: return NORTHEAST;
            case 2: return EAST;
            case 3: return SOUTHEAST;
            case 4: return SOUTH;
            case 5: return SOUTHWEST;
            case 6: return WEST;
            case 7: return NORTHWEST;
        }

        throw new RuntimeException ("Error: This cannot be reached!");
    }
}
