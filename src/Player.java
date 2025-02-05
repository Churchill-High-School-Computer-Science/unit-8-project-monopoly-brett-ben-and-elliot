
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
    public void addMoney(int a){
        money += a;
    }
    public void payRent(Property space){
        money -= space.getRent();
        Display.inform("You paid " + space.getOwner() + " " + space.getRent() + " dollars.");
        for(int i =0; i < Display.players.size(); i++){
            if(Display.players.get(i).getName().equals(space.getOwner())){
                Display.players.get(i).addMoney(space.getRent());
            }
        }
        
    }
    public void addProperty(Property space){
        if(money > space.getValue()){
            properties.add(space);
            space.bought(name);
            money -= space.getValue();
        }
        else{
            System.out.println("Sorry you can't afford this property.");
        }
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return location;
    }
    public void rolling(){
        int roll1 = (int)(Math.random() * 6) +1;    
        int roll2 = (int) (Math.random()  * 6) + 1;   
        location += roll1 + roll2;
        Display.inform("You have moved " + (roll1 + roll2) + " spaces!");
        if (location > 39) {
            location -= 40;
            System.out.println("Congrats you passed go and collected 200 dollars!");
            money += 200;
        }
        Display.boardPanel.repaint();
    }
}
