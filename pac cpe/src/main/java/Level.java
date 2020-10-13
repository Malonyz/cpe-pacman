import javax.swing.*;
import java.awt.*;
public class Level extends JPanel {

         JFrame window = new JFrame("PAC CPE") ;
         Pacman pacman = new Pacman(10,10,"assets//ghost1.png",true);
         Move move =new Move(pacman,this);
        public  Level(){
                window.addKeyListener(move);
                window.setFocusable(true);
                window.add(this);
                window.setSize(800,500);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
        }

        public void paint(Graphics g){
                ImageIcon background = new ImageIcon("assets//background.jpg");
                g.drawImage(background.getImage(),0,0,null);
                pacman.drawPacman(g);


        }

}


