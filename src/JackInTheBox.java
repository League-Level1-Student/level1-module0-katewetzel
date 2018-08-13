import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox {
public static void main(String[] args) {
JackInTheBox jb = new JackInTheBox();
jb.showButton();
}
public void showButton() {
	System.out.println("Button Clicked");
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setSize(100, 100);
	JButton button = new JButton();
	f.add(button);
	button.setText("Surprise");
}
	
}
