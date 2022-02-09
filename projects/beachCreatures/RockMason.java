import java.util.ArrayList;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class RockMason extends Actor{
    Random rand = new Random();
    
    public static void processActors(){

    }

    public void placeRock(){
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        ArrayList<Location> g = gr.getEmptyAdjacentLocations(loc);
        Location check = g.get(randNextInt(8))
        if (gr.isValid(check) && g.size() != 0){
        }
            
        else
            removeSelfFromGrid();
        flower.putSelfInGrid(gr, loc);
    }
    
}
