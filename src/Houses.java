

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r2d2 = new Robot();

	public static void main(String[] args) {
		r2d2.miniaturize();
		r2d2.setSpeed(50);
		r2d2.moveTo(20, 500);
		r2d2.penDown();
		String a = JOptionPane.showInputDialog("What size do you want the houses?");
		String b = JOptionPane.showInputDialog("What color do you want the houses?");
		for (int i = 0; i < 10; i++) {
			int r = new Random().nextInt(190) + 60;
			house(a,b);
			
		}
	}

	public static void house(String height, String color) {
		if(height.equals("small")) {
			if(color.equals("red")) {
				r2d2.setPenColor(Color.RED);
		r2d2.move(60);
		r2d2.turn(45);
		r2d2.move(20);
		r2d2.turn(90);
		r2d2.move(20);
		r2d2.turn(45);
		r2d2.move(60);
		r2d2.setPenColor(Color.green);
		r2d2.turn(-90);
		r2d2.move(25);
		r2d2.turn(-90);
			} else if(color.equals("blue")){
				r2d2.setPenColor(Color.BLUE);
				r2d2.move(60);
				r2d2.turn(45);
				r2d2.move(20);
				r2d2.turn(90);
				r2d2.move(20);
				r2d2.turn(45);
				r2d2.move(60);
				r2d2.setPenColor(Color.green);
				r2d2.turn(-90);
				r2d2.move(25);
				r2d2.turn(-90);
			} else if(color.equals("green")) {
				r2d2.setPenColor(Color.green);
				r2d2.move(60);
				r2d2.turn(45);
				r2d2.move(20);
				r2d2.turn(90);
				r2d2.move(20);
				r2d2.turn(45);
				r2d2.move(60);
				r2d2.setPenColor(Color.green);
				r2d2.turn(-90);
				r2d2.move(25);
				r2d2.turn(-90);
			}
	} else if(height.equals("medium")) {
		if(color.equals("red")) {
			r2d2.setPenColor(Color.red);
		} else if(color.equals("blue")) {
			r2d2.setPenColor(Color.blue);
		} else if(color.equals("green")){
			r2d2.setPenColor(Color.green);
		}
		r2d2.move(120);
		r2d2.turn(45);
		r2d2.move(20);
		r2d2.turn(90);
		r2d2.move(20);
		r2d2.turn(45);
		r2d2.move(120);
		r2d2.setPenColor(Color.green);
		r2d2.turn(-90);
		r2d2.move(25);
		r2d2.turn(-90);
	} else if(height.equals("large")) {
		if(color.equals("red")) {
			r2d2.setPenColor(Color.red);
		} else if(color.equals("blue")) {
			r2d2.setPenColor(Color.blue);
		} else if(color.equals("green")){
			r2d2.setPenColor(Color.green);
		}
		r2d2.move(250);
		r2d2.turn(45);
		r2d2.move(20);
		r2d2.turn(90);
		r2d2.move(20);
		r2d2.turn(45);
		r2d2.move(250);
		r2d2.setPenColor(Color.green);
		r2d2.turn(-90);
		r2d2.move(25);
		r2d2.turn(-90);
	}
}

}