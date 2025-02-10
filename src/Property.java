
import java.awt.Color;

public class Property {
    
    //TODO fix
    private Color color;
    private String name;
    private String owner;
    private int rent;
    private int numHouses;
    private int houseCost;
    private int propertyValue;
    private boolean ownable;
    private boolean purchased;
    public Property(Color c, String n,boolean buyable, int rate, int cost, int hCost){
        color = c;
        name = n;
        owner = "Nobody";
        rent = rate;
        numHouses = 0;
        propertyValue = cost;
        ownable = buyable;
        houseCost = hCost;
        purchased = false;
    }
    public int getHCost(){
        return houseCost;
    }
    public boolean getOwnable(){
        return ownable;
    }
    public boolean getPurchased(){
        return purchased;
    }
    public int getValue(){
        return propertyValue;
    }
    public Color getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public int getNumHouses(){
        return numHouses;
    }
    public String getOwner(){
        return owner;
    }
    public int getRent(){
        return rent;
    }
    public void setRent(int a){
        rent = a;
    }
    public void setOwner(String a){
        owner = a;
    }
    public void bought(String a){
        ownable =false;
        purchased = true;
        owner = a;
    }
}
