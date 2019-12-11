package _03_IntroToStacks;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 *
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> c = new Stack<String>();
	Stack<String> deleted = new Stack<String>();
	String print = "";
	String ev = "";

	void run() {
		frame.setVisible(true);
		panel.add(label);
		frame.add(panel);

		frame.setSize(800, 800);
		frame.addKeyListener(this);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub	
		c.push(print);	
		if (!c.isEmpty()) {

			if (e.getKeyCode() == 8) {
				deleted.push(c.pop());
				System.out.println("delete");
			}
		}
		System.out.println(e.getExtendedKeyCode());
		print = e.getKeyChar() + "";
		print = ev + print;
		label.setText(print);
	

		ev = print;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
