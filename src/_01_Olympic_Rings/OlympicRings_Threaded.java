package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {

	public static void main(String[] args) {
				Robot rob1 = new Robot(400, 300);
				Robot rob2 = new Robot(600, 300);
				Robot rob3 = new Robot(800, 300);
				Robot rob4 = new Robot(500, 500);
				Robot rob5 = new Robot(700, 500);
				
				rob1.setSpeed(10);
				rob2.setSpeed(10);
				rob3.setSpeed(10);
				rob4.setSpeed(10);
				rob5.setSpeed(10);
				
				rob1.penDown();
				rob2.penDown();
				rob3.penDown();
				rob4.penDown();
				rob5.penDown();
				
				rob1.setPenColor(Color.BLUE);
				rob2.setPenColor(Color.BLACK);
				rob3.setPenColor(Color.RED);
				rob4.setPenColor(Color.YELLOW);
				rob5.setPenColor(Color.GREEN);
				
				rob1.setPenWidth(10);
				rob2.setPenWidth(10);
				rob3.setPenWidth(10);
				rob4.setPenWidth(10);
				rob5.setPenWidth(10);
				

				Thread r1 = new Thread(()-> {
					for(int i=1; i<=360; i++) {
						rob1.setAngle(i);
						rob1.move(3);
					}
				});
				Thread r2 = new Thread(()-> {
					for(int i=1; i<=360; i++) {
						rob2.setAngle(i);
						rob2.move(3);
					}
				});
				Thread r3 = new Thread(()-> {
					for(int i=1; i<=360; i++) {
						rob3.setAngle(i);
						rob3.move(3);
					}
				});
				Thread r4 = new Thread(()-> {
					for(int i=1; i<=360; i++) {
						rob4.setAngle(i);
						rob4.move(3);
					}
				});
				Thread r5 = new Thread(()-> {
					for(int i=1; i<=360; i++) {
						rob5.setAngle(i);
						rob5.move(3);
					}
				});
				
				r1.start();
				r2.start();
				r3.start();
				r4.start();
				r5.start();
				
		}
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
}

