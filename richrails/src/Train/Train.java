package Train;

import java.util.ArrayList;

public class Train {
	private ArrayList<Component> allComponents;
	private String name;
	private int trainID;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	//Bij het aanmaken van een train wordt een locomotive toegevoegd. Hiervoor moet eerst een ComponentFactory geinstantieerd worden.
	//Dit is een hele brakke oplossing
	// to-do
	public Train(String name) {
		ComponentFactory ComponentFactory = new ComponentFactory();
		this.name = name;
		allComponents = new ArrayList<Component>();
		new SideViewObserver(this);
		this.addComponent(ComponentFactory.getComponent("locomotive"));
		TrainController.getInstance().addTrain(this);
		
		
	}
	
	public void addComponent(Component c) {
		allComponents.add(c);
		notifyAllObservers();
	}
	
	public ArrayList<Component> getAllComponents() {
		return allComponents;
	}

	public void setAllComponents(ArrayList<Component> allComponents) {
		this.allComponents = allComponents;
		notifyAllObservers();
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
	
	public void newTrain(String name) {
		Train tr = new Train(name);
	}
	
	public ArrayList<Component> getState(){
		return allComponents;
	}
	
	 public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   }

	public int calculateSeats() {
		//todo
		return 0;
	}
	
	public int currentNumberOfWagons() {
		int i = allComponents.size();
		return i;
	}
	
	public String toString() {
		String s = name;
		return s;
	}
}
