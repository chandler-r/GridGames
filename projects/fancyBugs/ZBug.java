import info.gridworld.actor.Bug;

public class ZBug extends Bug 
{
    private int steps;
    private int Zlength;
    private int Zsides;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        Zlength = length;
        Zsides = 0;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (Zsides == 0 || Zsides == 2) {
            setDirection(90);
        }

        if (steps < Zlength && canMove() && Zsides < 3) 
        {
            move();
            steps++;
        }
        else if(Zsides <= 2)
        {
            turn();
            turn();
            turn();
            steps = 0;
            Zsides++;
        }
        else {
            return;
        }     
    }

}