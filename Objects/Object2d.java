package Objects;

import kinematics.LinearKinematics;

public class Object2d {
    
    private double mMass;
    private LinearKinematics mLinearKinematics;

    public Object2d (double mass, LinearKinematics linearKinematics) {
        this.mMass = mass;
        this.mLinearKinematics = linearKinematics;
    }

    public Object2d (double mass) {
        this.mMass = mass;
        this.mLinearKinematics = new LinearKinematics();
    }
}
