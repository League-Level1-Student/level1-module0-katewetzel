package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r2d2 = new Robot();

	public static void main(String[] args) {
		r2d2.miniaturize();
		r2d2.setSpeed(50);
		r2d2.moveTo(20, 500);
		r2d2.penDown();
		for (int i = 0; i < 10; i++) {
			int r = new Random().nextInt(190) + 60;
			house(r);
		}
	}

	public static void house(int height) {
		r2d2.setRandomPenColor();
		r2d2.move(height);
		r2d2.turn(90);
		r2d2.move(40);
		r2d2.turn(90);
		r2d2.move(height);
		r2d2.setPenColor(Color.green);
		r2d2.turn(-90);
		r2d2.move(25);
		r2d2.turn(-90);
	}
}
