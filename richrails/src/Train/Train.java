package Train;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
@XmlSeeAlso({Locomotive.class})


public class Train {
	private ArrayList<Component> allComponents;
	private String name;
	private int trainID;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	public Train(String name) {
		this.name = name;
		allComponents = new ArrayList<Component>();
		new SideViewObserver(this);
		new TextBasedObserver(this);
		this.addComponent(ComponentFactory.getComponent("locomotive", name));
		TrainController.getInstance().addTrain(this);
			
	}
	
	public void addComponent(Component c) {
		allComponents.add(c);
		notifyAllObservers();
	}
	
	@XmlElement(name="name")
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElementWrapper(name="components")
    @XmlElement(name="component")
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

	public int getTrainID() {
		return trainID;
	}
	
	@XmlAttribute
	public void setTrainID(int id) {
		this.trainID = id;
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
	
	public void RemComponent(Component c) {
		allComponents.remove(c);
		notifyAllObservers();
	}
}
