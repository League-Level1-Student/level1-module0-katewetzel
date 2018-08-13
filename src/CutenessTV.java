import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
JButton button = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();

JFrame f = new JFrame();
JPanel p = new JPanel();

public static void main(String[] args) {
	CutenessTV c = new CutenessTV();
	c.showButton();
}

public void showButton() {
	System.out.println("Button clicked");
	f.setVisible(true);
	f.setSize(100, 150);
	f.add(p);
	p.add(button);
	p.add(button2);
	p.add(button3);
	button.setText("Ducks");
	button2.setText("Frog");
	button3.setText("Unicorns");
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	}


void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed.equals(button)) {
		showDucks();
	} else if(buttonPressed.equals(button2)) {
		showFrog();
	} else if(buttonPressed.equals(button3)) {
		showFluffyUnicorns();
	}
}


}
