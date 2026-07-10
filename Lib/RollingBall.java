package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener
{
    int x=100;
    int y=0;

    public RollingBall()
    {
        Timer t=new Timer(50, this);
        t.start();
    } 
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, y, 180);
    }    
    
    @Override
    public void actionPerformed(ActionEvent g)
    {
        x-=10;
        y+=50;
        if(x<-80) x=getWidth();
        if(y>=360) y=0;
        repaint();
    }
}