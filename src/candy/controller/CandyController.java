package candy.controller;

import javax.swing.JOptionPane;

import candy.model.MarshmallowCreature;

public class CandyController
{
	private MarshmallowCreature myCreature;
	String name;
	int numberOfLegs;
	int numberOfArms;
	int numberOfEyes;
	boolean singleButton;
	
	
	public CandyController()
	{
		
	}
	

	public void start()
	{
		//promptForInfo();
		makeMonster();
	}
	
	private void promptForInfo()
	{
		JOptionPane.showMessageDialog(null,"Help me decide what this creature look like!");
		name = JOptionPane.showInputDialog("What is my name?");
		JOptionPane.showMessageDialog(null,"Wow thats a great name!");
		numberOfLegs = Integer.parseInt(JOptionPane.showInputDialog(null, "How many legs should it have? "));
		numberOfArms = Integer.parseInt(JOptionPane.showInputDialog(null, "How many arms should it have?"));
		numberOfEyes = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
		
		
		
		
		
	}

	private void makeMonster()
	{
		myCreature = new MarshmallowCreature("Dacmerius Takteritricks", 3, 4, 3, true);
	}
}
