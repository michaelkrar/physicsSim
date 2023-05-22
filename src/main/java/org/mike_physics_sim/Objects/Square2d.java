package org.mike_physics_sim.Objects;

import java.util.ArrayList;

import org.mike_physics_sim.dynamics.LinearDynamics;
import org.mike_physics_sim.geometry.Translation2d;
import org.mike_physics_sim.kinematics.LinearKinematics;

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