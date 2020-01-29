package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton entry = new JButton();
	JButton id = new JButton();
	JButton list = new JButton();
	JButton remove = new JButton();
	HashMap<Integer, String> logsearch = new HashMap<Integer, String>();

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.create();
	}

	void create() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(entry);
		panel.add(id);
		panel.add(list);
		panel.add(remove);
		entry.setText("Add Entry");
		id.setText("Search by ID");
		list.setText("View list");
		remove.setText("Remove entry");
		frame.pack();
		id.addActionListener(this);
		entry.addActionListener(this);
		list.addActionListener(this);
		remove.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(entry)) {
			String num = JOptionPane.showInputDialog("Enter an ID number.");
			String name = JOptionPane.showInputDialog("Enter a name.");
			int num1 = Integer.parseInt(num);
			logsearch.put(num1, name);
		} else if (e.getSource().equals(id)) {
			String num = JOptionPane.showInputDialog("Enter an ID number.");
			
			if (logsearch.containsKey(Integer.parseInt(num))) {
				String name = logsearch.get(Integer.parseInt(num));
				JOptionPane.showMessageDialog(null, name);
			}
		} else if (e.getSource().equals(list)) {
			for(Integer i : logsearch.keySet()) {
	JOptionPane.showMessageDialog(null,"ID: "+ i +" Name: "+ logsearch.get(i));
}
		} else if (e.getSource().equals(remove)) {
			String num = JOptionPane.showInputDialog("Enter an ID number.");
			logsearch.remove(Integer.parseInt(num));
		}
	}

}
