package ex3;

public class TestRobot {
    public static void main(String [] args){
        RobotSimple robot = new RobotSimple("MyRobot");
        System.out.println(robot);
        robot.avancer();
        robot.tournerDroite();
        robot.avancer();
        robot.tournerDroite();
        robot.avancer();
        robot.tournerDroite();
        robot.avancer();
        robot.tournerDroite();
        robot.tournerDroite();
        robot.avancer();
        System.out.println(robot);
    }
}
