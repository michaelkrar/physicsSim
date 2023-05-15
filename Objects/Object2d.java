package Objects;

import dynamics.LinearDynamics;
import kinematics.LinearKinematics;

public class Object2d {
    
    private double mMass;
    private LinearKinematics mLinearKinematics;
    private LinearDynamics mLinearDynamics;

    public Object2d (double mass, LinearKinematics linearKinematics, LinearDynamics linearDynamics) {
        this.mMass = mass;
        this.mLinearKinematics = linearKinematics;
        this.mLinearDynamics = linearDynamics;
    }

    public Object2d (double mass, LinearKinematics linearKinematics) {
        this.mMass = mass;
        this.mLinearKinematics = linearKinematics;
        this.mLinearDynamics = new LinearDynamics();
    }

    public Object2d (double mass) {
        this.mMass = mass;
        this.mLinearKinematics = new LinearKinematics();
        this.mLinearDynamics = new LinearDynamics();
    }
    
}
