import info.gridworld.actor.Bug;
import java.awt.Color;

public class RainbowBug extends Bug
{
    private int color;

    public void act()
    {
        /*
        Uses the int color to designate when to switch to different colors and
        cycles through each color
        */
        if (color == 0)
        {
            setColor(Color.ORANGE);
            color++;
        }
        else if (color == 1)
        {
            setColor(Color.YELLOW);
            color++;
        }
        else if(color == 2)
        {
            setColor(Color.GREEN);
            color++;
        }
        else
        {
            setColor(Color.BLUE);
            color = 0;
        }
        
    }
    
}
