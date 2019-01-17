package Train;

import java.util.*;
public class TrainController {
	private static TrainController instance = new TrainController();
	private ArrayList<Train> Trains = new ArrayList<Train>();
	private ArrayList<Wagon> Wagons = new ArrayList<Wagon>();
	private ArrayList<Locomotive> Locomotives = new ArrayList<Locomotive>();
	private ArrayList<Train> tr = new ArrayList<Train>();
	
	private TrainController() {};
	
	public static TrainController getInstance() {
		return instance;
	}
	public void addTrain(Train train) {
		this.Trains.add(train);
	}
	
	public void addWagon(Wagon wagon) {
		this.Wagons.add(wagon);
	}
	
	public void addLocomotive(Locomotive Locomotive) {
		this.Locomotives.add(Locomotive);
	}
	
	public int getNrofTrains() {
		return Trains.size();
	}
	
	public ArrayList<Wagon> getAllWagons(){
		return Wagons;
	}
	
	public ArrayList<Train> getAllTrains(){
		return Trains;
	}
	
	public Train getTrain(String name) {
		Train tr = null;
		for (Train t: Trains) {
			if (t.getName().equals(name)) {
				tr = t;
			}
		}
		return tr;
	}
	
	public void delWagon(Wagon wagon) {
		Wagons.remove(wagon);
	}
	
	public void delTrain(Train train) {
		tr.add(train);
		Trains.removeAll(tr);
	}
	
	public void delLocomotive(Locomotive locomotive) {
		Locomotives.remove(locomotive);
	}
	
	public int getTrainIndex(Train train) {
		for (Train t: Trains)
		{
			if (t.getName() == train.getName()) {
				return Trains.indexOf(t);
			}
		}
		return 0;
	}
	
	public int getWagonIndex(Wagon wagon) {
		for (Wagon w: Wagons)
		{
			if (w.getName() == wagon.getName()) {
				return Wagons.indexOf(w);
			}
		}
		return 0;
	}
	
	public int getLocomotiveIndex(Locomotive loco) {
		for (Locomotive l: Locomotives)
		{
			if (l.getName() == loco.getName()) {
				return Locomotives.indexOf(l);
			}
		}
		return 0;
	}
	
	public Wagon getWagon(String name) {
		Wagon wa = null;
		for (Wagon w: Wagons) {
			if (w.getName().equals(name)) {
				wa = w;
			}
		}
		return wa;
	}
}
