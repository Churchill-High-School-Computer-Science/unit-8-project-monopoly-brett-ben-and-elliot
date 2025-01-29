
import java.awt.Color;

public class Property {
    
    //TODO fix
    Color color;
    String name;
    String owner;
    int rent;
    int numHouses;
    int houseCost;
    int propertyValue;
    boolean mortgaged;
    int mortgagePay;
    int mortgageBuy;
    boolean ownable;
    public Property(Color c, String n,boolean buyable, int rate, int cost, int hCost){
        color = c;
        name = n;
        owner = "Nobody";
        rent = rate;
        numHouses = 0;
        propertyValue = cost;
        ownable = buyable;
        houseCost = hCost;
    }
    public int getHCost(){
        return houseCost;
    }
    public boolean getOwnable(){
        return ownable;
    }
    public int getValue(){
        return propertyValue;
    }
    public Color getColor(){
        return color;
    }

    //TODO fix
    public String getName(){
        return name;
    }

    //TODO fix
    public int getNumHouses(){
        return numHouses;
    }

    //TODO fix
    public String getOwner(){
        return owner;
    }

    //TODO fix
    public int getRent(){
        return rent;
    }
}
