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
	
	@Override
	public Component createComponent() {
		return null;
	}
}
