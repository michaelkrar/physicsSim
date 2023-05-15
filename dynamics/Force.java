package dynamics;

import javax.sql.rowset.spi.TransactionalWriter;

import Objects.Body2d;
import geometry.Translation2d;

public class Force {

    private Translation2d mForce;
    private Body2d mExertingBody;

    public Force (Translation2d forceVector) {
        mForce = forceVector;
    }

    public Force (double x, double y) {
        mForce = new Translation2d(x, y);
    }

    public void update (Translation2d newForce) {
        mForce = newForce;
    }

}
