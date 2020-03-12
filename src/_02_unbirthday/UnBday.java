package _02_unbirthday;

import javax.swing.JOptionPane;

public class UnBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String response=JOptionPane.showInputDialog("whens your brithday?");
		
		if(response.equalsIgnoreCase("03/11")) {
			
			JOptionPane.showMessageDialog(null, ("happy birthday who ever you are"));
			
	
		}
		else JOptionPane.showMessageDialog(null, ("happy UNbirthday to you"));
	}

}
