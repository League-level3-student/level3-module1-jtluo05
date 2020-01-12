package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HangMan implements KeyListener{
	Random r = new Random();
	static Stack<String> hm = new Stack<String>();
	static String word = "";
	static JFrame frame = new JFrame();
	static JLabel label = new JLabel();

	public static void main(String[] args) {
	HangMan hangman=new HangMan();
		hangman.stuff();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		String input = JOptionPane.showInputDialog("How many words do you want to solve?");
		int numOfWords = Integer.parseInt(input);
		for (int i = 0; i < numOfWords; i++) {
			word = Utilities.readRandomLineFromFile("dictionary.txt");
			hm.push(word);
				}
		
	}
	
	 void stuff() {
		frame.setVisible(true);
		frame.add(label);	
		label.setText("");
frame.addKeyListener(this);
		frame.setSize(300, 300);
	}

	 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
