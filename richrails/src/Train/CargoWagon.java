package Train;

public class CargoWagon implements Component {
	private String name;
	private int wagonID;
	private int capacity;
	
	public CargoWagon()
	{}
	
	public CargoWagon(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getcapacity() {
		return capacity;
	}

	public void setcapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getWagonID() {
		return wagonID;
	}

	public String toString() {
		String s = "The id for this wagon is " + wagonID + ", it's name is " + name + " and it has " + capacity + " kg capacity.";
		return s;
	}
}
