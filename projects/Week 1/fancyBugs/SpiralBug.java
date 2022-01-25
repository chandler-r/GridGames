import info.gridworld.actor.Bug;

public class SpiralBug extends Bug 
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a spiral bug that traces a spiral from its starting point outwards
     */
    public SpiralBug()
    {
        steps = 0;
        sideLength = 1;
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
            sideLength++;
        }
    }
}
