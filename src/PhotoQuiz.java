/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String x = "https://s.abcnews.com/images/Blotter/donald-trump-02-ap-jc-180806_hpMain_4x3_992.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component n;
		// 3. use the "createImage()" method below to initialize your Component
n = createImage(x);
		// 4. add the image to the quiz window
quizWindow.add(n);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String one = JOptionPane.showInputDialog("Who is this person?");
		// 7. print "CORRECT" if the user gave the right answer
if(one.equals("Trump")) {
	System.out.println("CORRECT");
} else {
		// 8. print "INCORRECT" if the answer is wrong
System.out.println("INCORRECT");}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(n);
		// 10. find another image and create it (might take more than one line of code)
String y = "https://amp.thisisinsider.com/images/5a9056c2c169952e008b45e2-750-562.jpg";
		// 11. add the second image to the quiz window
Component z;
		// 12. pack the quiz window
z = createImage(y);
quizWindow.add(z);
quizWindow.pack();
		// 13. ask another question
String two = JOptionPane.showInputDialog("Who is this person?");
		// 14+ check answer, say if correct or incorrect, etc.
if(two.equals("Michael B. Jordan")) {
	System.out.println("CORRECT");
} else {
System.out.println("INCORRECT");}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





