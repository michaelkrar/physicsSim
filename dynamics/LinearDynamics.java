package dynamics;

import java.util.ArrayList;

import geometry.Translation2d;

public class LinearDynamics {
    
    private ArrayList<Translation2d> mFreeBody;

    public LinearDynamics (ArrayList<Translation2d> forces) {
        this.mFreeBody = forces;
    }

    public LinearDynamics () {
        this.mFreeBody = new ArrayList<Translation2d>();
    }

    public Translation2d netForce (ArrayList<Translation2d> forces) {
        if(forces.size() != 1) { //we add the last force in the list to the first one, until we only have 1 force left
            forces.get(0).add(forces.get(forces.size()-1));
            forces.remove(forces.size()-1);
            return netForce();
        } else {
            return forces.get(0);
        }
    }

    public Translation2d netForce () {
        return netForce(mFreeBody);
    }

    public Translation2d netAccel (double mass) { // i dont like how i have to get mass from the encapsulating class
        return netForce().scale(1/mass);
    }

}
