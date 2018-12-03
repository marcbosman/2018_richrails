package Train;

import java.util.ArrayList;

public class Train {
	private ArrayList<Component> allComponents = new ArrayList<Component>();
	private String name;
	private int trainID;
	
	public Train(String name) {
		this.name = name;
	}
	
	public void addComponent(Component c) {
		allComponents.add(c);
	}
	
	public ArrayList<Component> getAllComponents() {
		return allComponents;
	}

	public void setAllComponents(ArrayList<Component> allComponents) {
		this.allComponents = allComponents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTrainID() {
		return trainID;
	}

	public int calculateSeats() {
		//todo
		return 0;
	}
	
	public String toString() {
		String s = trainID + " " + allComponents;
		return s;
	}
}
