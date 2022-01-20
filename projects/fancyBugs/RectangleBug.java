import info.gridworld.actor.Bug;

public class RectangleBug extends Bug{
    private int steps;
    private int sideWidth;  
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public RectangleBug(int length, int width)
    {
        steps = 0;
        sideLength = length;
        sideWidth = width;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            steps = 0;
        }
    }
    
}
