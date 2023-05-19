package Objects;

import java.util.ArrayList;

import dynamics.LinearDynamics;
import geometry.Translation2d;
import kinematics.LinearKinematics;

public class Square2d extends Object2d{


    private ArrayList<Translation2d> corners;

    public Square2d(double mass, LinearKinematics linearKinematics, LinearDynamics linearDynamics, ArrayList<Translation2d> corners) {
        super(mass, linearKinematics, linearDynamics);
        this.corners = corners;
    }

    public Translation2d getTopLeftCorner () {
        ArrayList<Translation2d> corners2 = corners;
        return null;
    }

    public boolean isPointInside (Translation2d point) {
        
        
        return false;

    }
    
    
}