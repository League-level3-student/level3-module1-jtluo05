package _04_HangMan;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Random r = new Random();
	static Stack<String> hm = new Stack<String>();
	static String word = "";
	static JFrame frame = new JFrame();
	static JLabel label = new JLabel();
	static JPanel panel=new JPanel();
	static String p;
	String underscore = "";
	int lettercount = 0;

	public static void main(String[] args) {
		HangMan hangman = new HangMan();

		String input = JOptionPane.showInputDialog("How many words do you want to solve?");
		int numOfWords = Integer.parseInt(input);
		for (int i = 0; i < numOfWords; i++) {
			word = Utilities.readRandomLineFromFile("dictionary.txt");
			hm.push(word);

		}
		for (int i = 0; i < numOfWords; i++) {
			p = hm.pop();
		}
		hangman.lettercount = p.length();
		hangman.stuff();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		

		for (int i = 0; i < lettercount; i++) {
			
			if (e.getKeyChar() == p.charAt(i)) {
				if (i == 0) {

					underscore = p.charAt(i) + underscore.substring(i+1);

					
				}
				else if (i == lettercount - 1) {
					underscore = underscore.substring(0, lettercount - 1) + p.charAt(i);
				} 
				else {
					underscore=underscore.substring(0, i)+p.charAt(i)+ underscore.substring(i+1);
				}
			}
			label.setText(underscore);
frame.pack();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	void stuff() {
		frame.setVisible(true);
		panel.add(label);
		for (int i = 0; i < lettercount; i++) {
			underscore = underscore + "_";

		}
		label.setText(underscore);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.setPreferredSize(new Dimension(300,300));
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
