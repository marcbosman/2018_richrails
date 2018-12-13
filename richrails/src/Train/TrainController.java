package Train;

import java.util.*;
public class TrainController {
	private static TrainController instance = new TrainController();
	private ArrayList<Train> Trains = new ArrayList<Train>();
	
	private TrainController() {};
	
	public static TrainController getInstance() {
		return instance;
	}
	public void addTrain(Train train) {
		this.Trains.add(train);
	}
	
	public int getNrofTrains() {
		return Trains.size();
	}
	
	public int getIndex(Train train) {
		for (Train t: Trains)
		{
			if (t.getName() == train.getName()) {
				return Trains.indexOf(t);
			}
		}
		return 0;
	}
}
