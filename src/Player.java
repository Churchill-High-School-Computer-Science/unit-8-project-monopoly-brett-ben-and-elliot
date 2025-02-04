
import java.util.ArrayList;
import java.lang.Math;
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
        if (location > 39) {
            location -= 40;
            System.out.println("Congrats you passed go and collected 200 dollars!");
            money += 200;
        }
        return location;
    }
    public void rolling(){
        int roll1 = (int)(Math.random() * 6) +1;    
        int roll2 = (int) (Math.random()  * 6) + 1;   
        location += roll1 + roll2;
        Display.inform("You have moved " + (roll1 + roll2) + " spaces!");
        Display.boardPanel.repaint();
    }
}
