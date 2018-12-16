package antlrDSL;

import PoorRail.PoorInterface;
import Train.*;
import antlrDSL.richrailsParser.GetcommandContext;

public class richrailsCommand extends richrailsBaseListener {
	
	@Override public void enterCommand(richrailsParser.CommandContext ctx) 
	{ 
	
	}
	
	@Override public void enterNewcommand(richrailsParser.NewcommandContext ctx) 
	{
		if (ctx.getText().toLowerCase().startsWith("newtrain")) {
			Train train = new Train(ctx.getText().toLowerCase().split("newtrain")[1]);
			PoorInterface.setCMDOutput("New train " + ctx.getText().toLowerCase().split("newtrain")[1] + " added" );
			}
		else if (ctx.getText().toLowerCase().startsWith("newwagon")) {
			ComponentFactory.getComponent("wagon", ctx.getText().toLowerCase().split("newwagon")[1] );
			PoorInterface.setCMDOutput("New wagon " + ctx.getText().toLowerCase().split("newwagon")[1] + " created");
			
		}
			
		
	}

	@Override public void enterAddcommand(richrailsParser.AddcommandContext ctx) 
	{
		System.out.println("Now adding train/wagon " + ctx.getText());
		String compname = ctx.getText().toLowerCase().substring(3).split("to")[0];
		System.out.println(compname);
		String trainname = ctx.getText().toLowerCase().split("to")[1];
		System.out.println(trainname);
//		TrainController.getInstance().getTrain(trainname).addComponent(TrainController.getInstance().getWagon(compname));;
		
	}
	
	@Override public void enterGetcommand(richrailsParser.GetcommandContext ctx) 
	{
		System.out.println("Now getting seats of train " + ctx.getText());
	}
	
	@Override public void enterDelcommand(richrailsParser.DelcommandContext ctx) 
	{
		System.out.println("Now deleting train " + ctx.getText());
	}
	
	@Override public void enterRemcommand(richrailsParser.RemcommandContext ctx) 
	{
		System.out.println("Now removing train " + ctx.getText());
	}
}