import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
}

public void showButton() {
    System.out.println("Button clicked");
    JFrame f = new JFrame();
    f.setVisible(true);
    f.setSize(100, 100);
    JButton button = new JButton();
    f.add(button);
    button.addActionListener(this);
    
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
	int rand = new Random().nextInt(5);
if(rand == 0) {
	JOptionPane.showMessageDialog(null, "Your fortune: Do or do not. There is no try");
} else if(rand == 1) {
	JOptionPane.showMessageDialog(null, "Your fortune: Today is the day to show someone you care.");
} else if(rand ==2) {
	JOptionPane.showMessageDialog(null, "Your fortune: It's not the destination, it's the journey ");
} else if(rand ==3) {
	JOptionPane.showMessageDialog(null, "Your fortune: It's ok to talk to strangers ");
} else if(rand ==4) {
	JOptionPane.showMessageDialog(null, "Your fortune: Mistakes happen.");
}
}

}


