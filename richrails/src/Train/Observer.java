package Train;

import java.util.HashMap;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public abstract class Observer {
	protected Train train;
	public abstract void update();
	public abstract String addTrain(Train train, JComboBox cbAllTrains, HashMap numberOfWagons, int currentNumberOfWagons, int currentTrain);
	public abstract void drawLocomotive(Train train, JPanel drawPanel, int currentTrain, int OFFSET);
	public abstract void drawWagon();
}
