import info.gridworld.actor.Bug;
import java.util.Random;

public class RandomBug extends Bug
{
    private int move;
    private int steps;
    private int turn;
    private int turns;
    Random rand = new Random();

    public void act()
    {
        move = rand.nextInt(50);
        turn = rand.nextInt(50);

        /** 
         * Randomly chooses whether to move on spot or not and turns a random amount of times
        */
        if (move > 25 && steps < 1)
        {
            move();
            steps++;
        }
        else
        {
            while(turns< turn){
                turn();
                turns++;
            }
        }
    }
}
