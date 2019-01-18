package xml_test;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="allTrains")
public class TrainController {
	ArrayList<Train> allTrains = new ArrayList<Train>();

	public ArrayList<Train> getAllTrains() {
		return allTrains;
	}

	@XmlElement(name="train")
	public void setAllTrains(ArrayList<Train> allTrains) {
		this.allTrains = allTrains;
	}
	
	public void addTrain(Train t) {
		allTrains.add(t);
	}
}
