import info.gridworld.actor.Bug;

public class RectangleBug extends Bug{
    private int steps;
    private int sideWidth;  
    private int sideLength;
    private int sideCounter;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public RectangleBug(int length, int width)
    {
        steps = 0;
        sideCounter = 0;
        sideLength = length;
        sideWidth = width - 1;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLength && sideCounter%2 == 0)
        {
            move();
            steps++;
        }
        else if (steps < sideWidth && sideCounter%2==1)
        {
            move();
            steps++;
        }
        else 
        {
            turn();
            turn();
            steps = 0;
            sideCounter++;
        }
    }
    
}
