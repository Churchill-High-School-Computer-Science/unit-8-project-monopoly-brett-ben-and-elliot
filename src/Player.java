
import java.util.ArrayList;

public class Player {
    private String name;
    private int money;
    private int location;
    private ArrayList<Property> properties;
    private boolean getOutJail;
    private boolean jailed;
    private int jailTurns;
    private int turnOrder;
    //TODO FIX
    public Player(String n, int turn){
        name = n;
        money = 1500;
        location = 0;
        properties = new ArrayList<Property>();
        getOutJail = false;
        jailed = false;
        jailTurns = 0;
        turnOrder = turn;
        
    }
    public boolean getOJail(){
        return getOutJail;
    }
    public int turnsServed(){
        return jailTurns;
    }
    public boolean UinJail(){
        return jailed;
    }
    public String getName(){
        return name;
    }
    public int Order(){
        return turnOrder;
    }

    ///TODO FIX
    public int getMoney(){
        return money;
    }

    //TODO FIX
    public ArrayList<Property> getProperties(){
        return properties;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return location;
    }
}
