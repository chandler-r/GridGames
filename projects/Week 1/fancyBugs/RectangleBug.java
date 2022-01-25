import info.gridworld.actor.Bug;

public class RectangleBug extends Bug{
    private int steps;
    private int sideWidth;  
    private int sideLength;
    private int sideCounter;

    /**
     * Constructs a rectangle bug that traces a rectangle of a given side length and width
     * @param length the side length
     * @param width the side width
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
        /** 
         * To differentiate between the between the two different side lengths, we use mod so that 
         * the 0th and 2nd side of the rectangle or a different length than the 1st and 3rd
        */
    
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
