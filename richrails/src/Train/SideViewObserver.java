package Train;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import PoorRail.PoorInterface;

public class SideViewObserver extends Observer {
	
	private int NrofTrains;
	private int OFFSET = 100;
	private int TRAINLENGTH = 100;
	private int NrofWagons;
	private JPanel Panel;
	
	public SideViewObserver(Train train){
	      this.train= train;
	      this.train.attach(this);
	   }
	
	   @Override
	   public void update() {
		   this.Panel = PoorInterface.getdrawPanel();
		   for (Component c : train.getState()) {
			    if (c instanceof Locomotive) { drawLocomotive(Panel);}
			    
			    else if (c instanceof Wagon) { }
			   
		   }
	     //test
	   }
	   
//		public String addTrain(Train train, JComboBox cbAllTrains, HashMap numberOfWagons, int currentNumberOfWagons,
//				int currentTrain) {
//		{
//			String t = "";
//			try
//			{
//				t = train.getName().trim();
//				for (int i = 0; i < cbAllTrains.getItemCount();i++ )
//				{
//					String cbTrain = (String)cbAllTrains.getItemAt(i);
//					if (cbTrain.equalsIgnoreCase(t))
//					{
//						t = "";
//						break;
//					}
//				}
//				if (t != "")
//				{
//					if (currentTrain >= 0)
//					{
//						numberOfWagons.put(currentTrain,currentNumberOfWagons);
//					}
//					cbAllTrains.addItem(t);
//					cbAllTrains.setSelectedItem(t);
//					numberOfWagons.put(t, 0);
//				}
//			}
//			catch (Exception e)
//			{
//			}
//			return t;
//		}
//		}
	   
	   public void drawLocomotive(JPanel drawPanel){
				NrofTrains = TrainController.getInstance().getNrofTrains();
				Graphics g = drawPanel.getGraphics();
				g.setColor(Color.LIGHT_GRAY);
				//
				g.fillRect(30,80+NrofTrains*OFFSET,80,40);
				g.fillRect(80,60+NrofTrains*OFFSET,30,30);
				
				g.drawRoundRect(85, 40+NrofTrains*OFFSET, 20, 20, 20, 20);
				g.drawRoundRect(85, NrofTrains*OFFSET, 40, 40, 40, 40);
				g.setColor(Color.BLACK);
				// WIELEN
				g.fillRoundRect(35, 120+NrofTrains*OFFSET, 20, 20, 20, 20);
				g.fillRoundRect(80, 120+NrofTrains*OFFSET, 20, 20, 20, 20);
				// STRING TEXT
				g.drawString(train.getName(),40,105+NrofTrains*OFFSET);
			}

	@Override
	public void drawWagon(Wagon wagon, JPanel drawPanel) {
		// TODO Auto-generated method stub
		
	}
	   	   
//	   public void drawWagon(Wagon wagon, JPanel drawPanel){
//		    Graphics g = drawPanel.getGraphics();
//		    NrofWagons = ;
//			g.setColor(Color.LIGHT_GRAY);
//			g.fillRect(30+currentNumberOfWagons*TRAINLENGTH,80+currentTrain*OFFSET,80,40);
//			g.setColor(Color.BLACK);
//			g.fillRoundRect(35+currentNumberOfWagons*TRAINLENGTH, 120+currentTrain*OFFSET, 20, 20, 20, 20);
//			g.fillRoundRect(80+currentNumberOfWagons*TRAINLENGTH, 120+currentTrain*OFFSET, 20, 20, 20, 20);
//			g.drawString(wagon,40+currentNumberOfWagons*TRAINLENGTH,105+currentTrain*OFFSET);
//	   }


}
