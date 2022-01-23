import info.gridworld.actor.Bug;
import java.awt.Color;

public class RainbowBug extends Bug
{
    public void act()
    {
        Color c = getColor();
        int red = (int) (c.getRed());
        int green = (int) (c.getGreen());
        int blue = (int) (c.getBlue());
        setColor(new Color(red,green,blue));
    }
    
}
