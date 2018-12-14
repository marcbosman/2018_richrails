package Train;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import PoorRail.PoorInterface;

public class TestMain {
	public static void main(String args[]) {
//		ComponentFactory ComponentFactory = new ComponentFactory();
//		
//		Train t1 = new Train("testtrein");
//		//Component comp1 = ComponentFactory.getComponent("locomotive");
//		Component wag1 = ComponentFactory.getComponent("wagon");
//		//t1.addComponent(comp1);
//		t1.addComponent(wag1);
//		System.out.println(t1.getAllComponents());
//		
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run() 
			{
				PoorInterface inst = new PoorInterface();
				inst.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//				inst.setUndecorated(true);
				inst.setVisible(true);
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			    inst.getContentPane().setPreferredSize(new Dimension(1000, 1000));
//			    inst.pack();
			}
		});
		
	}
}
