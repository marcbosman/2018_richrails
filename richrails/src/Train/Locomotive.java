package Train;

public class Locomotive implements Component {
	private String name;
	private int LocomotiveId;
	private int horsePower = 200;
	
	public Locomotive(String nm)
	{name = nm;
	TrainController.getInstance().addLocomotive(this);}
	
	public Locomotive(int horsePower) {
		this.horsePower = horsePower;
	}
	
	//Dit gebruiken we nooit
//	@Override
//	public Component createComponent() {
//		return new Locomotive(0);
//	}
	
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
