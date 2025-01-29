import java.awt.Color;
public class Board {
    Property[][] properties = new Property[11][11];
    
    public Board(){
        Display.properties = properties;
        properties[0][0] = new Property(Color.BLACK,"GO", false,0,0,0 );
        properties[0][1] = new Property(new Color(102,51,0),"Mediterranean Avenue", true,2,60,50 );
        properties[0][1] = new Property(Color.BLACK,"Community Chest", false,0,0,0 );
        properties[0][1] = new Property(new Color(102,51,0),"Baltic Avenue", true,4,60,50 );
        properties[0][0] = new Property(Color.BLACK,"INCOME TAX", false,0,0,0 );
        properties[0][1] = new Property(Color.WHITE,"Reading RailRoad", true,25,200,0 );
        properties[0][1] = new Property(new Color(0,153,204),"Oriental Avenue", true,6,100,50 );
        properties[0][0] = new Property(Color.BLACK,"CHANCE", false,0,0,0 );
        properties[0][1] = new Property(new Color(0,153,204),"Vermont Avenut", true,6,100,50 );
        properties[0][1] = new Property(new Color(0,153,204),"Connecticut Avenue", true,8,120,50 );
        properties[0][0] = new Property(Color.BLACK,"JAIL", false,0,0,0 );
        properties[0][1] = new Property(new Color(204,68,204),"St. Charles Place", true,10,140,100 );
        properties[0][1] = new Property(Color.GRAY,"Electric Company", true,0,150,0 );
        properties[0][1] = new Property(new Color(204,68,204),"States Avenue", true,10,140,100 );
        properties[0][1] = new Property(new Color(204,68,204),"Virginia Avenue", true,12,160,100 );
        properties[0][1] = new Property(Color.WHITE,"Pennsylvania Railroad", true,25,200,0 );
        properties[0][1] = new Property(new Color(204,68,204),"St. James Place", true,14,180,100 );
        properties[0][1] = new Property(Color.BLACK,"Community Chest", false,0,0,0 );
        properties[0][1] = new Property(new Color(204,68,204),"Tennessee Avenue", true,14,180,100 );
        properties[0][1] = new Property(new Color(204,68,204),"New York Avenue", true,16,200,100 );
        properties[0][1] = new Property(Color.BLACK,"Free Parking", false,0,0,0 );
        properties[0][1] = new Property(new Color(255,0,0),"Kentucky Avenue", true,18,220,150 );
        properties[0][0] = new Property(Color.BLACK,"CHANCE", false,0,0,0 );
        properties[0][1] = new Property(new Color(255,0,0),"Indiana Avenue", true,18,220,150 );
        properties[0][1] = new Property(new Color(255,0,0),"Illinois Avenue", true,20,240,150 );
        properties[0][1] = new Property(Color.WHITE,"B&O Railroad", true,25,200,0 );
        properties[0][1] = new Property(new Color(255,255,51),"Atlantic Avenue", true,22,260,150 );
        properties[0][1] = new Property(new Color(255,255,51),"Ventnor Avenue", true,22,260,150 );
        properties[0][1] = new Property(Color.GRAY,"Water Works", true,0,150,0 );
        properties[0][1] = new Property(new Color(255,255,51),"Marvin Gardens", true,24,280,150 );
        properties[0][1] = new Property(Color.BLACK,"Go To Jail", false,0,0,0 );
        properties[0][1] = new Property(new Color(51,153,51),"Pacific Avenue", true,26,300,200 );
        properties[0][1] = new Property(new Color(255,255,51),"North Carolina Avenue", true,26,300,200 );
        properties[0][1] = new Property(Color.BLACK,"Community Chest", false,0,0,0 );
        properties[0][1] = new Property(new Color(255,255,51),"Pennsylvania Avenue", true,28,320,200 );
        properties[0][1] = new Property(Color.WHITE,"Short Line Railroad", true,25,200,0 );
        properties[0][1] = new Property(Color.BLACK,"Chance", false,0,0,0 );
        properties[0][1] = new Property(new Color(51,153,51),"Park Place", true,35,350,200 );
        properties[0][1] = new Property(Color.BLACK,"Luxury Tax", false,0,0,0 );
        properties[0][1] = new Property(new Color(51,153,51),"Boardwalk", true,50,400,200 );

































    }
    
}
