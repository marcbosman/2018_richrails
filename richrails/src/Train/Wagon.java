package Train;

public class Wagon implements Component {
	private String name;
	private int wagonID;
	private int seats;
	
	public Wagon()
	{}
	
	public Wagon(int seats) {
		this.seats = seats;
	}
	
	//Dit gebruiken we niet
//	@Override
//	public Component createComponent() {
//		return new Wagon();
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getWagonID() {
		return wagonID;
	}

	public String toString() {
		String s = "The id for this wagon is " + wagonID + ", it's name is " + name + " and it has " + seats + " seats.";
		return s;
	}
}
