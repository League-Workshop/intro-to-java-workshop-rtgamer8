package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		 Robot c3po = new Robot();
		 
		 c3po.setSpeed(90);
		 
		 c3po.penDown();
		 
		
		for (int i = 0; i<4; i++) {
			 
			c3po.sparkle();

			c3po.setPenWidth(60);

			c3po.setRandomPenColor();
			
			 c3po.move(120); 
		
			c3po.turn(90);
			
			c3po.move(50);
			
			c3po.setRandomPenColor();
			
			 c3po.move(120); 
		
			c3po.turn(90);c3po.setRandomPenColor();
			
			 c3po.move(120); 
		
			c3po.turn(90);c3po.setRandomPenColor();
			
			 c3po.move(120); 
		
			c3po.turn(90);c3po.setRandomPenColor();
			
			 c3po.move(120); 
		
			c3po.turn(90);
			
			
			
		}
		}
		
	}
