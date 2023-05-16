import java.lang.reflect.Array;
import java.util.ArrayList;
import Objects.Object2d;
import Visualization.FrameTest;
import dynamics.LinearDynamics;
import geometry.Translation2d;
import kinematics.LinearKinematics;

public class Main {
    public static void main(String[] arg) throws InterruptedException{
        System.out.println("Welcome to physics simulator");
        Translation2d testTranslation = new Translation2d(0, 0);
        Translation2d testVelocity = new Translation2d(0, 0);
        Translation2d testAccel = new Translation2d(2, 1);

        LinearKinematics testKinematics = new LinearKinematics(testTranslation, testVelocity, testAccel);

       

        ArrayList<Translation2d> forces = new ArrayList<Translation2d>();


        Object2d block = new Object2d(1, new LinearKinematics(), new LinearDynamics(forces));

        FrameTest f = new FrameTest();
        f.init();

        for(int i = 0; i<100000; i++) {
            Thread.sleep(1000);
            if(i==10){
                block.linearDynamics().addForce(new Translation2d(0,10));
                System.out.println("I started applying a constant force of 10 N in +y");
            }
            if(i==50){
                block.linearDynamics().removeAllForces();
                System.out.println("I suddenly stopped applying the force");

            }
            block.loop(1);
            f.drawObject(block);
            System.out.println(block.linearKinematics().position().x() + " " +block.linearKinematics().position().y());
        }
    }
}
// initial position: 0,0
//initial velocity, 0,0
//initial accel: 2,1 //it looks like our y velocity is not increasing despite acceleration being 1
// 1.0,0.5 
// 4.0,1.5
// 9.0,1.5
// 16.0,1.5
// 25.0,1.5
// 36.0,1.5
// 49.0,1.5