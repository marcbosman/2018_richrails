package antlrDSL;

import GUI.PoorInterface;
import Train.*;
import antlrDSL.richrailsParser.GetcommandContext;
import persistence.XmlSave;

@SuppressWarnings("unused")
public class richrailsCommand extends richrailsBaseListener {
	
	@Override public void enterCommand(richrailsParser.CommandContext ctx) 
	{ 
	
	}
	
	@Override public void enterNewcommand(richrailsParser.NewcommandContext ctx) 
	{	
		if (ctx.getChild(0).getChild(1).getText().equalsIgnoreCase("train")) {				//check if the command is about a train or a wagon
			Train train = new Train(ctx.getChild(0).getChild(2).getText());
			PoorInterface.setCMDOutput("New train " + ctx.getChild(0).getChild(2).getText() + " added" );
		}
		else if (ctx.getChild(0).getChild(1).getText().equalsIgnoreCase("wagon")) {			//check if the command includes a number of seats for the wagon
			if (ctx.getChild(0).getChildCount() < 4) {
				ComponentFactory.getComponent("wagon", ctx.getChild(0).getChild(2).getText() );
				PoorInterface.setCMDOutput("New wagon " + ctx.getChild(0).getChild(2).getText() + " created");
			}
			else if (ctx.getChild(0).getChild(3).getText().equalsIgnoreCase("numseats")) {
				ComponentFactory.getComponent("wagon", ctx.getChild(0).getChild(2).getText());
				TrainController.getInstance().getWagon(ctx.getChild(0).getChild(2).getText()).setSeats(Integer.parseInt(ctx.getChild(0).getChild(4).getText()));
				PoorInterface.setCMDOutput("New wagon " + ctx.getChild(0).getChild(2).getText() + " with " + ctx.getChild(0).getChild(4).getText() + " seats created");
			}
			
		}
	}

	@Override public void enterAddcommand(richrailsParser.AddcommandContext ctx) 
	{
			String compname = ctx.getChild(1).getText();
			String trainname = ctx.getChild(3).getText();
						
			for (Wagon w: TrainController.getInstance().getAllWagons()) {				//Check if the specified wagon exists, then add it to the train if it does
				if (w.getName().equalsIgnoreCase(compname)) {
					TrainController.getInstance().getTrain(trainname).addComponent(TrainController.getInstance().getWagon(compname));
					PoorInterface.setCMDOutput("Wagon " + compname + " added to train " + trainname);
					break;
				}
			}
	}
	
	@Override public void enterGetcommand(richrailsParser.GetcommandContext ctx) 
	{
		int numseats = 0;
		
		if (ctx.getChild(1).getText().equals("train")) {								//Check if the command is about a train or a wagon
			for (Component c: TrainController.getInstance().getTrain(ctx.getChild(2).getText()).getAllComponents()) {
				if (c instanceof Wagon) {
					numseats = numseats + ((Wagon) c).getSeats();
				}
			}
			PoorInterface.setCMDOutput("Train " + ctx.getChild(2).getText() + " has " + numseats + " seats");
		}
		else if (ctx.getChild(1).getText().equals("wagon")) {
			numseats = TrainController.getInstance().getWagon(ctx.getChild(2).getText()).getSeats();
			PoorInterface.setCMDOutput("Wagon " + ctx.getChild(2).getText() + " has " + numseats + " seats");
		}
		
	}
	
	@Override public void enterDelcommand(richrailsParser.DelcommandContext ctx) 
	{
		if (ctx.getChild(1).getText().equalsIgnoreCase("train")) {
			for (Train t: TrainController.getInstance().getAllTrains()) {
				if (t.getName().equalsIgnoreCase(ctx.getChild(2).getText())) {
					for (Component c: t.getAllComponents()) {
						if (c instanceof Wagon) {
							TrainController.getInstance().delWagon((Wagon) c);
						}
						else if (c instanceof Locomotive) {
							TrainController.getInstance().delLocomotive((Locomotive) c);
						}
					TrainController.getInstance().delTrain(t);
					}
				}
			}
		}
		else if (ctx.getChild(0).getChild(1).getText().equalsIgnoreCase("wagon")) {
			
		}
	}
	
	@Override public void enterRemcommand(richrailsParser.RemcommandContext ctx) 
	{
		String compname = ctx.getChild(1).getText();
		String trainname = ctx.getChild(3).getText();
		Component comp = TrainController.getInstance().getWagon(compname);
	
		for (Train t: TrainController.getInstance().getAllTrains()) {				//Check if the specified train exists
			if (t.getName().equalsIgnoreCase(trainname)) {
				t.RemComponent(comp);
			}
		}
	}
}