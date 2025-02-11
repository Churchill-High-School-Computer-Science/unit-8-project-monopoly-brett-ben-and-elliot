
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
    private int rrOwned;
    private int utilOwned;
    private int roll;
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
        rrOwned = 0;
        utilOwned =0;
        roll =0;
    }
    public int getRoll(){
        return roll;
    }
    public int getRROwned(){
        return rrOwned;
    }
    public int getUtilOwned(){
        return utilOwned;
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
        if (space.getName().equals("Water Works")||space.getName().equals("Electric Company")){
            for(int i =0; i < Display.players.size(); i++){
                if(Display.players.get(i).getName().equals(space.getOwner())){
                    int util = Display.players.get(i).getUtilOwned();
                    if (util == 2){
                        int cost = roll*10;
                        money -= cost;
                        Display.inform("You paid " + space.getOwner() + " " + cost + " dollars.");
                        for(int o =0; i < Display.players.size(); o++){
                            if(Display.players.get(o).getName().equals(space.getOwner())){
                                Display.players.get(o).addMoney(cost);
                            }
                         }
                    }
                    else if (util == 1){
                        int cost = roll*4;
                        money -= cost;
                        Display.inform("You paid " + space.getOwner() + " " + cost + " dollars.");
                        for(int p =0; i < Display.players.size(); p++){
                            if(Display.players.get(p).getName().equals(space.getOwner())){
                                Display.players.get(p).addMoney(cost);
                            }
                         }
                    }
                }
            }
        }
        
        else if (space.getName().equals("Reading RailRoad")||space.getName().equals("Short Line Railroad")||space.getName().equals("B&O Railroad")||space.getName().equals("Pennsylvania Railroad")){
            for(int i =0; i < Display.players.size(); i++){
                if(Display.players.get(i).getName().equals(space.getOwner())){
                    if (Display.players.get(i).getRROwned() == 1){
                        int cost = 25;
                        money -= cost;
                        Display.inform("You paid " + space.getOwner() + " " + cost + " dollars.");
                        for(int u =0; i < Display.players.size(); u++){
                            if(Display.players.get(u).getName().equals(space.getOwner())){
                                Display.players.get(u).addMoney(cost);
                            }
                         }    
                    }
                    else if (Display.players.get(i).getRROwned() == 2){
                        int cost = 50;
                        money -= cost;
                        Display.inform("You paid " + space.getOwner() + " " + cost + " dollars.");
                        for(int o =0; i < Display.players.size(); o++){
                            if(Display.players.get(o).getName().equals(space.getOwner())){
                                Display.players.get(o).addMoney(cost);
                            }
                         }    
                    }
                    else if (Display.players.get(i).getRROwned() == 3){
                        int cost = 100;
                        money -= cost;
                        Display.inform("You paid " + space.getOwner() +  cost + " dollars.");
                        for(int p =0; i < Display.players.size(); p++){
                            if(Display.players.get(p).getName().equals(space.getOwner())){
                                Display.players.get(p).addMoney(cost);
                            }
                         }    
                    }
                    else if (Display.players.get(i).getRROwned() == 4){
                        int cost = 200;
                        money -= cost;
                        Display.inform("You paid " + space.getOwner() + " " + cost + " dollars.");
                        for(int a =0; i < Display.players.size(); a++){
                            if(Display.players.get(a).getName().equals(space.getOwner())){
                                Display.players.get(a).addMoney(cost);
                            }
                         }    
                    }
                }    
            }
        }
        else{
        money -= space.getRent();
        Display.inform("You paid " + space.getOwner() + " " + space.getRent() + " dollars.");
        for(int i =0; i < Display.players.size(); i++){
            if(Display.players.get(i).getName().equals(space.getOwner())){
                Display.players.get(i).addMoney(space.getRent());
            }
        }
        }
        
    }
    public void addProperty(Property space){
        if(money > space.getValue()){
            properties.add(space);
            space.bought(name);
            money -= space.getValue();
            if(space.getName().equals("Reading RailRoad")||space.getName().equals("Short Line Railroad")||space.getName().equals("B&O Railroad")||space.getName().equals("Pennsylvania Railroad")){
                rrOwned++;
            }
            if (space.getName().equals("Water Works")||space.getName().equals("Electric Company")){
                utilOwned++;
        }
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
        roll = roll1 + roll2;
        location += roll1 + roll2;
        Display.inform("You have moved " + (roll1 + roll2) + " spaces!");
        if (location > 39) {
            location -= 40;
            System.out.println("Congrats you passed go and collected 200 dollars!");
            money += 200;
        }
        Display.boardPanel.repaint();
    }
    public void Chance(){
        int numbers = (int)(Math.random() * 7);
        String list[] = {"Collect $200" , "Advance to nearest Utility", "Buy a present, Pay $75", "Bank pays you dividend, receive $50", "Go back 3 Spaces", "Go to Jail", "Pay poor tax, $15" };
        Display.inform(list[numbers]);
        if (numbers == 0){
            money += 200;
        }
        else if (numbers == 1){
            if (location > 12 || location < 28){
                location = 28;
            }
            else if (location > 28 || location < 12){
                location = 12;
            }
        }
        else if (numbers == 2){
            money -= 75;
        }
        else if (numbers == 3){
            money += 50;
        }
        if (numbers == 4){
            location -= 3;
        }
        if (numbers == 5){
            location = 10;
        }
        if (numbers == 6){
            money -= 15;
        }
    }

    public void CommunityChest(){
        int numbers = (int) (Math.random() * 6) + 1;
        if (numbers == 1){
            money +=200;
            Display.inform("Bank error in your favor. Collect $200");
        }
        else if (numbers == 2){
            money-=50;
            Display.inform("Doctor's fee. Pay $50");
        }
        else if (numbers == 3){
            money+=20;
            Display.inform("Income tax refund. Collect $20");
        }
        else if (numbers == 4){
            money-=50;
            Display.inform("Pay school fees of $50");
        }
        else if (numbers == 5){
            money+=100;
            Display.inform("Life insurance matures. Collect $100");
        }
        else{
            money+=200;
            location = 0;
            Display.inform("Advance to Go");
        }
    }
}
