import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.Location;

public class FancyBugRunner 
{
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(new UnboundedGrid<>());
        world.add(new Location(5, 5), john);
        world.show();
    }
    
}
