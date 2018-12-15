package antlrDSL;

import Train.Train;
import antlrDSL.richrailsParser.GetcommandContext;

public class richrailsCommand extends richrailsBaseListener {
	
	@Override public void enterCommand(richrailsParser.CommandContext ctx) 
	{ 
		System.out.println("Command entered " + ctx.getText());
	}
	
	@Override public void enterNewcommand(richrailsParser.NewcommandContext ctx) 
	{
			
		Train train = new Train(ctx.getText().toLowerCase().split("newtrain")[1]);
	}

	@Override public void enterAddcommand(richrailsParser.AddcommandContext ctx) 
	{
		System.out.println("Now adding train/wagon " + ctx.getText());
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