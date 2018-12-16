package Train;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import PoorRail.PoorInterface;

public class SideViewObserver implements Observer {
	
	private int NrofTrains;
	private int OFFSET = 100;
	private int TRAINLENGTH = 100;
	private int NrofWagons;
	private JPanel Panel;
	private Train train;
	private String Wagonname;
	private String Loconame;
	
	public SideViewObserver(Train train){
	      this.train= train;
	      this.train.attach(this);
	   }
	
	   @Override
	   public void update() {
		   this.Panel = PoorInterface.getdrawPanel();
		   Component c = train.getState().get(train.getState().size()-1);
		    if (c instanceof Locomotive) { 
		    	Loconame = ((Locomotive) c).getName();
		    	drawLocomotive(Panel);
		     	}
			    
			else if (c instanceof Wagon) { 
				Wagonname = ((Wagon) c).getName();
				drawWagon(Panel);
				
			}
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
				g.drawString(Loconame,40,105+NrofTrains*OFFSET);
			}

	   	   
	   public void drawWagon(JPanel drawPanel){
		    Graphics g = drawPanel.getGraphics();
		    NrofWagons = 0;
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(30+TrainController.getInstance().getTrain(train.getName()).currentNumberOfWagons()*TRAINLENGTH-100,80+TrainController.getInstance().getTrainIndex(train)*OFFSET,80,40);
			g.setColor(Color.BLACK);
			g.fillRoundRect(35+TrainController.getInstance().getTrain(train.getName()).currentNumberOfWagons()*TRAINLENGTH-100, 120+TrainController.getInstance().getTrainIndex(train)*OFFSET, 20, 20, 20, 20);
			g.fillRoundRect(80+TrainController.getInstance().getTrain(train.getName()).currentNumberOfWagons()*TRAINLENGTH-100, 120+TrainController.getInstance().getTrainIndex(train)*OFFSET, 20, 20, 20, 20);
			g.drawString(Wagonname,40+TrainController.getInstance().getTrain(train.getName()).currentNumberOfWagons()*TRAINLENGTH-100,105+TrainController.getInstance().getTrainIndex(train)*OFFSET);
	   }


}
