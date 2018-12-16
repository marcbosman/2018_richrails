package Train;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import GUI.PoorInterface;

public class Main {
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() 
			{
				PoorInterface inst = new PoorInterface();
				inst.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				inst.setVisible(true);
			}
		});
		
	}
}
