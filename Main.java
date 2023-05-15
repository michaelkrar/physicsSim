import geometry.Translation2d;
import kinematics.LinearKinematics;

public class Main {
    public static void main(String[] arg) throws InterruptedException{
        System.out.println("Welcome to physics simulator");
        Translation2d testTranslation = new Translation2d(0, 0);
        Translation2d testVelocity = new Translation2d(0, 0);
        Translation2d testAccel = new Translation2d(2, 1);

        LinearKinematics testKinematics = new LinearKinematics(testTranslation, testVelocity, testAccel);

        for(int i = 0; i<100000; i++) {
            Thread.sleep(1000);
            testKinematics.loop(1);
            System.out.println(testKinematics.position().x() + "," + testKinematics.position().y());
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