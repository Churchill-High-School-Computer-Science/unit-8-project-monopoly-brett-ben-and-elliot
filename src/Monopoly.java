import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {
        Board b = new Board();
        Player a = new Player("Elliot", 1);
        Player c = new Player("Brett", 2);
        Display.players.add(a);
        Display.players.add(c);
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(a);
        players.add(c);
        boolean win = false;
        for (int i = 0; i<40; i++){    
            for (Player play: players){
                play.rolling();
                if (Board.propertiesMap.get(play.getLocation()).getOwnable() && !Board.propertiesMap.get(play.getLocation()).getPurchased()){
                    String[] choose = {"yes","no"};
                    if(Display.choice("Buy Property?", "Would you like to purchase this property?", choose) == 0){
                        play.addProperty(Board.propertiesMap.get(play.getLocation()));
                    }
                }
                else{
                    if(Board.propertiesMap.get(play.getLocation()).getPurchased()){
                        play.payRent(Board.propertiesMap.get(play.getLocation()));
                    }
                }
            }

        }
        }
}
