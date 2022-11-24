package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;;

public class GAMEOVER extends JPanel {
    private ImageIcon background = new ImageIcon(this.getClass().getResource("GAM.jpg"));
    private ImageIcon exit = new ImageIcon(this.getClass().getResource("edit.png"));
    private ImageIcon restart = new ImageIcon(this.getClass().getResource("BaK.png"));
    public int last = 0;
    public int x = 0;
    public int y = 0;
    GAMEOVER(){
        setLayout(null);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX() >= 425 && e.getX() <= 575 && e.getY() >= 225 && e.getY() <= 375){
                    x = e.getX();
                    y = e.getY();
                    
                }
                else if(e.getX() >= 850 && e.getX() <= 940 && e.getY() >= 450 && e.getY() <= 540){
                    System.exit(0);
                }
            }
            
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background.getImage(),0,0,1000,600,this);
        g.drawImage(restart.getImage(),425,225,150,150,this);
        g.drawImage(exit.getImage(),850,450, 90,90 ,this);
        g.setColor(Color.white);
        g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,60));
        g.drawString("SCORE : "+last,340,200);
    }
}
