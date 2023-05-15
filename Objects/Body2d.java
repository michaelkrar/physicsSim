package Objects;

import kinematics.LinearKinematics;

public class Body2d {
    
    private double mMass;
    private LinearKinematics mLinearKinematics;

    public Body2d (double mass, LinearKinematics linearKinematics) {
        this.mMass = mass;
        this.mLinearKinematics = linearKinematics;
    }

    public Body2d (double mass) {
        this.mMass = mass;
        this.mLinearKinematics = new LinearKinematics();
    }
}
