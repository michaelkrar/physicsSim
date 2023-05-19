package src.main.java.org.mike_physics_sim.Visualization;

import javax.swing.JFrame;

import src.main.java.org.mike_physics_sim.Objects.Object2d;
import src.main.java.org.mike_physics_sim.geometry.Translation2d;

import java.awt.Graphics;
import java.awt.Color;

public class FrameTest extends JFrame{

    public FrameTest () {
    
    }

    public void init () {
        setSize(640,480);
        setTitle("Physics Sim");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        paint(getGraphics());
    }

    public void paint(Graphics g) {
        super.paint(g);

        //draw square outline
        g.drawRect(50,50,100,100);

        //set color to RED
        //So after this, if you draw anything, all of it's result will be RED
        g.setColor(Color.RED);

        //fill square with RED
        g.fillRect(50,50,100,100);
    }

    public void drawObject (Object2d obj) {
        Graphics g = getGraphics();
        Translation2d mPos = obj.linearKinematics().position();
        g.drawRect((int)(mPos.x()*.4), (int)(mPos.y()*.4), 50,10);
    }
}