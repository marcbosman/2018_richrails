package Train;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Wagon implements Component {
	private String name;
	private int wagonID;
	private int seats = 0;
	
	public Wagon(String nm)
	{name = nm;
	TrainController.getInstance().addWagon(this);}
	
	public Wagon(int seats) {
		this.seats = seats;
	}
	
	@Override
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
	
//    public static class ParentAdapter extends XmlAdapter<Object,Object>{
//        @Override
//        public Object marshal( Object arg0 ) throws Exception{ return arg0; }
//
//        @Override
//        public Object unmarshal( Object arg0 ) throws Exception{ return arg0; }
//    }

