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
        for (int i = 0; i<10; i++){    
            for (Player play: players){
                play.rolling();
                play.getLocation();
            }

        }
        }
}
