package Train;

import java.util.ArrayList;

public class Train {
	private ArrayList<Component> allComponents;
	private String name;
	private int trainID;
	
	public Train(String name) {
		this.name = name;
	}
	
	public void addComponent(Component c) {
		allComponents.add(c);
	}
	
	public int calculateSeats() {
		//todo
		return 0;
	}
	
	public String toString() {
		//todo
		return "";
	}
}
