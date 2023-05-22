package org.mike_physics_sim.Objects;

import org.mike_physics_sim.dynamics.LinearDynamics;
import org.mike_physics_sim.geometry.Translation2d;
import org.mike_physics_sim.kinematics.LinearKinematics;

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

    public Translation2d netAccel () {
        return mLinearDynamics.netAccel(mMass);
    }

    public void loop (double dt) {
        mLinearKinematics.setAcceleration(netAccel());
        mLinearKinematics.loop(dt);
    }

    public LinearDynamics linearDynamics () {
        return mLinearDynamics;
    }

    public LinearKinematics linearKinematics () {
        return mLinearKinematics;
    }

    public double mass () {
        return mMass;
    }

}
