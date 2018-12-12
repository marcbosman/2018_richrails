package Train;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SideViewObserver extends Observer {
	
	private int NrofTrains;
	private int OFFSET = 100;
	
	public SideViewObserver(Train train){
	      this.train= train;
	      this.train.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( train.getState()); 
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
	   
	   public void drawLocomotive(Train train, JPanel drawPanel){
		   // DRAW TRAIN METHOD
			if (train.getName() != "")
			{
				NrofTrains = Station.getInstance().getNrofTrains();
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
	   }
	   
	   public void drawWagon(){
		   
	   }


}
