package _05_Intro_To_Hash_Maps;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _02_LogSearch extends JFrame implements ActionListener{
     
	public static void main(String[] args) {
		
	}
     // Crate a HashMap of Integers for the keys and Strings for the values.
     HashMap<Integer, String> database = new HashMap<Integer, String>();
     JFrame frame = new JFrame();
     JPanel panel = new JPanel();
     JButton addEntry = new JButton();
     JButton searchDatabase = new JButton();
     JButton viewDatabase = new JButton();
     JButton deleteEntry = new JButton();
     int Register_ID_Number = 0;
     int Search_ID_Number = 0;
     int Remove_ID_Number = 0;
     String Name_Input;
	public void controlSetup() {
		frame.add(panel);
		frame.setVisible(true);
		addEntry.addActionListener(this);
		deleteEntry.addActionListener(this);
		searchDatabase.addActionListener(this);
		viewDatabase.addActionListener(this);
		panel.add(addEntry);
		panel.add(deleteEntry);
		panel.add(searchDatabase);
		panel.add(viewDatabase);
	}
     /* Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     */ 
     public void addEntry(){
    	 String Register_ID_Input = JOptionPane.showInputDialog("Please enter an ID number.");
    	 Register_ID_Number = Integer.parseInt(Register_ID_Input);
    	 Name_Input = JOptionPane.showInputDialog("Please enter the first and last name of the individual.");
    	 database.put(Register_ID_Number, Name_Input);
     }
     /* Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     */
     public void searchEntry() {
    	 String Search_ID_Input = JOptionPane.showInputDialog("Please enter the ID number of the individual");
    	 Search_ID_Number = Integer.parseInt(Search_ID_Input);
    	 
}
     /* Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     */
     public void viewList() {
    	 for(int i = 0; i < database.size(); i++) {
    		 JOptionPane.showMessageDialog(null, "Name: " + Register_ID_Number + " Name: " + Name_Input + ".");
    	 }
     }
     /* Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list. 
     */
     public void removeEntry() {
    	 String Remove_ID_Input = JOptionPane.showInputDialog("Please enter the ID number of the individual");
    	 Remove_ID_Number = Integer.parseInt(Remove_ID_Input);
    	 if(database.containsKey(Remove_ID_Number)) {
    	 database.remove(Remove_ID_Input);
    	 }
    	 else {
    		 JOptionPane.showMessageDialog(null, "No such entry exists.");
    	 }
}
@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addEntry) {
			addEntry();
		}
		if(e.getSource() == deleteEntry) {
			removeEntry();
		}
		if(e.getSource() == searchDatabase) {
			searchEntry();
		}
		if(e.getSource() == viewDatabase) {
			viewList();
		}
	}
}
