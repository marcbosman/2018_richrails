package Train;

public class TextBasedObserver implements Observer {

	private Train train;

	public TextBasedObserver(Train train){
	      this.train= train;
	      this.train.attach(this);
	   }
	
	@Override
	public void update() {
		String result = "";
		String compname = "";
		for (Train t : TrainController.getInstance().getAllTrains()) {
			for (Component c : t.getState()) {
					compname = c.getName();
					result = result + compname + " -- ";
			   	}
			result = result + "\n";
		} 
		System.out.println("--------------------------------------------");
		System.out.println(result);
		System.out.println("--------------------------------------------");
		System.out.println("\n \n \n");
		
		
		
	}

		
	

}
