import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class TownCrier extends Critter
{

    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
        Grid<Actor> g = getGrid();
        
        // Get current location
        Location l = getLocation();
        int row = l.getRow(), col = l.getCol();
        
        for (int r = row - 2; r < row + 2; r++) {
            for (int c = col - 2; c < col +2; c++){
                Location check = new Location(r, c);
                if (getGrid().isValid(check)){
                    Actor target = g.get(check);
                    if (target instanceof Critter){
                        actors.add(target);
                    }
                }
            }
        }
    }
}
    
