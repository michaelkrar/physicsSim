package org.mike_physics_sim.dynamics;

import org.mike_physics_sim.Objects.Object2d;
import org.mike_physics_sim.geometry.Translation2d;

public class Force {
    private Translation2d vector;

    public Force (Translation2d vector) {
        this.vector = vector;
    } 

    public Translation2d vector () {
        return vector;
    }

    public double work (Object2d obj, double dt) {//read write lock would help
        return 0.5 * Math.pow(obj.linearKinematics().dv(dt).hypot(),2) * obj.mass();
    }//why wouldl this even be in this class

    public double work (double ds) {
        return ds*vector.hypot();
    }

    public double impulse (double dt) {
        return vector.hypot()*dt;
    }

    public Translation2d momentum (Object2d obj) {
        return obj.linearKinematics().velocity().scale(obj.mass());
    }//this too

}
