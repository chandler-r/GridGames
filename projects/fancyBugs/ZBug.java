import info.gridworld.actor.Bug;

public class ZBug extends Bug 
{
    private int steps;
    private int Zlength;
    private int Zsides;

    /**
     * Constructs a Z bug that traces a Z of a given side length
     * @param length the side length of the Z
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
        /**
         * When the bug is at the left side of the Z, it will turn to face the right
         */
        if (Zsides == 0 || Zsides == 2) {
            setDirection(90);
        }

        /**
         * Moves the bug while the Z has less than three side and turns it when the bug has created 
         * a side of the desired length
         */
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