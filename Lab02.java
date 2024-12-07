import java.util.Scanner;
//CSCE-145 Section-003
//Tyrel Hamilton
public class Lab02 {
public static final double ACCELERATION = 9.8;
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");
		double initialVelocity = key.nextDouble();
		System.out.println("How much time (in seconds) does the ball take to reach point B?");
		double time = key.nextDouble();
		double finalVelocity = initialVelocity + ACCELERATION * time;
		double distance = initialVelocity * time + 0.5 * ACCELERATION * Math.pow(time, 2);
		System.out.println("Final Velocity of the ball = " + finalVelocity + " m/s");
		System.out.println("Distance traveled by the ball = " + distance + " meters");

	}

}
