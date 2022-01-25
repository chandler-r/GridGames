import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.Location;

public class FancyBugRunner 
{
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(new UnboundedGrid<>());
        RandomBug john = new RandomBug();
        RectangleBug rohn = new RectangleBug(7,4);
        RainbowBug bohn = new RainbowBug();
        ZBug nohn = new ZBug(7);
        SpiralBug wohn = new SpiralBug();
        CircleBug hohn = new CircleBug(7);
        world.add(new Location(5, 5), john);
        world.add(new Location(7, 5),rohn);
        world.add(new Location(9, 5), bohn);
        world.add(new Location(11, 5), nohn);
        world.add(new Location(13, 5), wohn);
        world.add(new Location(15, 5), hohn);
        world.show();
    }
    
}
