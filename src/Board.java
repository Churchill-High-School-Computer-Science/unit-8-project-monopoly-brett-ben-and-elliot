import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
public class Board {
    Property[][] properties = new Property[11][11];
    static Map<Integer,Property> propertiesMap = new HashMap<>();
    
    public Board(){
        Display.properties = properties;
        properties[0][0] = new Property(Color.BLACK,"GO", false,0,0,0 );
        propertiesMap.put(0, properties[0][0]);
        properties[1][0] = new Property(new Color(102,51,0),"Mediterranean Avenue", true,2,60,50 );
        propertiesMap.put(1, properties[1][0]);
        properties[2][0] = new Property(Color.BLACK,"Community Chest", false,0,0,0 );
        propertiesMap.put(2, properties[2][0]);
        properties[3][0] = new Property(new Color(102,51,0),"Baltic Avenue", true,4,60,50 );
        propertiesMap.put(3, properties[3][0]);
        properties[4][0] = new Property(Color.BLACK,"INCOME TAX", false,0,0,0 );
        propertiesMap.put(4, properties[4][0]);
        properties[5][0] = new Property(Color.WHITE,"Reading RailRoad", true,25,200,0 );
        propertiesMap.put(5, properties[5][0]);
        properties[6][0] = new Property(new Color(0,153,204),"Oriental Avenue", true,6,100,50 );
        propertiesMap.put(6, properties[6][0]);
        properties[7][0] = new Property(Color.BLACK,"CHANCE", false,0,0,0 );
        propertiesMap.put(7, properties[7][0]);
        properties[8][0] = new Property(new Color(0,153,204),"Vermont Avenut", true,6,100,50 );
        propertiesMap.put(8, properties[8][0]);
        properties[9][0] = new Property(new Color(0,153,204),"Connecticut Avenue", true,8,120,50 );
        propertiesMap.put(9, properties[9][0]);
        properties[10][0] = new Property(Color.BLACK,"JAIL", false,0,0,0 );
        propertiesMap.put(10, properties[10][0]);
        properties[10][1] = new Property(new Color(204,68,204),"St. Charles Place", true,10,140,100 );
        propertiesMap.put(11, properties[10][1]);
        properties[10][2] = new Property(Color.GRAY,"Electric Company", true,0,150,0 );
        propertiesMap.put(12, properties[10][2]);
        properties[10][3] = new Property(new Color(204,68,204),"States Avenue", true,10,140,100 );
        propertiesMap.put(13, properties[10][3]);
        properties[10][4] = new Property(new Color(204,68,204),"Virginia Avenue", true,12,160,100 );
        propertiesMap.put(14, properties[10][4]);
        properties[10][5] = new Property(Color.WHITE,"Pennsylvania Railroad", true,25,200,0 );
        propertiesMap.put(15, properties[10][5]);
        properties[10][6] = new Property(new Color(255,165,0),"St. James Place", true,14,180,100 );
        propertiesMap.put(16, properties[10][6]);
        properties[10][7] = new Property(Color.BLACK,"Community Chest", false,0,0,0 );
        propertiesMap.put(17, properties[10][7]);
        properties[10][8] = new Property(new Color(255,165,0),"Tennessee Avenue", true,14,180,100 );
        propertiesMap.put(18, properties[10][8]);
        properties[10][9] = new Property(new Color(255,165,0),"New York Avenue", true,16,200,100 );
        propertiesMap.put(19, properties[10][9]);
        properties[10][10] = new Property(Color.BLACK,"Free Parking", false,0,0,0 );
        propertiesMap.put(20, properties[10][10]);
        properties[9][10] = new Property(new Color(255,0,0),"Kentucky Avenue", true,18,220,150 );
        propertiesMap.put(21, properties[9][10]);
        properties[8][10] = new Property(Color.BLACK,"CHANCE", false,0,0,0 );
        propertiesMap.put(22, properties[8][10]);
        properties[7][10] = new Property(new Color(255,0,0),"Indiana Avenue", true,18,220,150 );
        propertiesMap.put(23, properties[7][10]);
        properties[6][10] = new Property(new Color(255,0,0),"Illinois Avenue", true,20,240,150 );
        propertiesMap.put(24, properties[6][10]);
        properties[5][10] = new Property(Color.WHITE,"B&O Railroad", true,25,200,0 );
        propertiesMap.put(25, properties[5][10]);
        properties[4][10] = new Property(new Color(255,255,51),"Atlantic Avenue", true,22,260,150 );
        propertiesMap.put(26, properties[4][10]);
        properties[3][10] = new Property(new Color(255,255,51),"Ventnor Avenue", true,22,260,150 );
        propertiesMap.put(27, properties[3][10]);
        properties[2][10] = new Property(Color.GRAY,"Water Works", true,0,150,0 );
        propertiesMap.put(28, properties[2][10]);
        properties[1][10] = new Property(new Color(255,255,51),"Marvin Gardens", true,24,280,150 );
        propertiesMap.put(29, properties[1][10]);
        properties[0][10] = new Property(Color.BLACK,"Go To Jail", false,0,0,0 );
        propertiesMap.put(30, properties[0][10]);
        properties[0][9] = new Property(new Color(51,153,51),"Pacific Avenue", true,26,300,200 );
        propertiesMap.put(31, properties[0][9]);
        properties[0][8] = new Property(new Color(51,153,51),"North Carolina Avenue", true,26,300,200 );
        propertiesMap.put(32, properties[0][8]);
        properties[0][7] = new Property(Color.BLACK,"Community Chest", false,0,0,0 );
        propertiesMap.put(33, properties[0][7]);
        properties[0][6] = new Property(new Color(51,153,51),"Pennsylvania Avenue", true,28,320,200 );
        propertiesMap.put(34, properties[0][6]);
        properties[0][5] = new Property(Color.WHITE,"Short Line Railroad", true,25,200,0 );
        propertiesMap.put(35, properties[0][5]);
        properties[0][4] = new Property(Color.BLACK,"Chance", false,0,0,0 );
        propertiesMap.put(36, properties[0][4]);
        properties[0][3] = new Property(new Color(0,0,139),"Park Place", true,35,350,200 );
        propertiesMap.put(37, properties[0][3]);
        properties[0][2] = new Property(Color.BLACK,"Luxury Tax", false,0,0,0 );
        propertiesMap.put(38, properties[0][2]);
        properties[0][1] = new Property(new Color(0,0,139),"Boardwalk", true,50,400,200 );
        propertiesMap.put(39, properties[0][1]);

































    }
    
}
