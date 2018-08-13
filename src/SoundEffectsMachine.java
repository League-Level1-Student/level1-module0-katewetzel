import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public static void main(String[] args) {
	SoundEffectsMachine s = new SoundEffectsMachine();
	s.showButton();
}
public void showButton() {
	System.out.println("Button clicked");
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setSize(100, 150);
	JPanel p = new JPanel();
	f.add(p);
	p.add(button);
	p.add(button2);
	p.add(button3);
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
if(buttonPressed.equals(button)) {
	playSound("cymbal.wav");
}
if(buttonPressed.equals(button2)) {
	playSound("homer-woohoo.wav");
}
if(buttonPressed.equals(button3)) {
	playSound("sawing-wood-daniel_simon.wav");
}
}

private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}

}
