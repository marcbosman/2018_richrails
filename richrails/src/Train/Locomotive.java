package Train;

public class Locomotive {
	private int LocomotiveId;
	private int horsePower;
	
	public Locomotive(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public Locomotive createComponent() {
		//todo
		return new Locomotive(0);
	}
	
	public String toString() {
		//todo
		return "";
	}
}
