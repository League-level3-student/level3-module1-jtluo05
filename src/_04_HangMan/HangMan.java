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
     static String p; 
     String underscore="";
      int lettercount=0;
	public static void main(String[] args) {
	HangMan hangman=new HangMan();
			
		String input = JOptionPane.showInputDialog("How many words do you want to solve?");
		int numOfWords = Integer.parseInt(input);
		for (int i = 0; i < numOfWords; i++) {
			word = Utilities.readRandomLineFromFile("dictionary.txt");
			hm.push(word);
				
				}
		for (int i = 0; i < numOfWords; i++) {
			p=hm.pop();
				}
	hangman.lettercount=p.length();
			hangman.stuff();
	
	
	}
	

	 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
String ontolabel;
		for (int i = 0; i < lettercount; i++) {
		ontolabel=underscore.charAt(i)+"";
	if (e.getKeyChar()==p.charAt(i)) {
		
		
		ontolabel=ontolabel.substring(0, i)+p.charAt(i)+ ontolabel.substring(i);
		
		
		label.setText(ontolabel);
}	
}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
void stuff() {
		frame.setVisible(true);
		frame.add(label);
		for (int i = 0; i < lettercount; i++) {
			underscore=underscore+"_";
		
		}
		label.setText(underscore);
frame.addKeyListener(this);
		frame.setSize(300, 300);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
