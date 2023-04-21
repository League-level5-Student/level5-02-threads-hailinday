package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	// 1. make a main method
	
    // 2. create an array of 5 robots.
	
    // 3. use a for loop to initialize the robots.

    // 4. make each robot start at the bottom of the screen, side by side, facing up

    // 5. use another for loop to iterate through the array and make each robot move
    // a random amount less than 50.

    // 6. use a while loop to repeat step 5 until a robot has reached the top of the
    // screen.

    // 7. declare that robot the winner and throw it a party!

    // 8. try different races with different amounts of robots.

    // 9. make the robots race around a circular track.
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		Robot[] robots = new Robot[5];
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot(800,950);
		}
		
		Thread r1 = new Thread(()-> {
			while(robots[0].getY()>0) {
				robots[0].move(rand.nextInt(100));
			}
			System.out.println("Robot 1 has finished");
		});
		Thread r2 = new Thread(()-> {
			while(robots[1].getY()>0) {
				robots[1].move(rand.nextInt(100));
			}
			System.out.println("Robot 2 has finished");
		});
		Thread r3 = new Thread(()-> {
			while(robots[2].getY()>0) {
				robots[2].move(rand.nextInt(100));
			}
			System.out.println("Robot 3 has finished");
		});
		Thread r4 = new Thread(()-> {
			while(robots[3].getY()>0) {
				robots[3].move(rand.nextInt(100));
			}
			System.out.println("Robot 4 has finished");
		});
		Thread r5 = new Thread(()-> {
			while(robots[4].getY()>0) {
				robots[4].move(rand.nextInt(100));
			}
			System.out.println("Robot 5 has finished");
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}
