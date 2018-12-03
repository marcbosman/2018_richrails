package Train;

public class Locomotive implements Component {
	private String name;
	private int LocomotiveId;
	private int horsePower;
	
	public Locomotive()
	{}
	
	public Locomotive(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public Component createComponent() {
		return new Locomotive(0);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getLocomotiveId() {
		return LocomotiveId;
	}

	public String toString() {
		String s = "The id for this locomotive is " + LocomotiveId + ", it's name is " + name + " and it has " + horsePower + " horsepower.";
		return s;
	}
}
