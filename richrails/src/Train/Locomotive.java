package Train;

import javax.xml.bind.annotation.adapters.XmlAdapter;

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
	
	@Override
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
	
    public static class ParentAdapter extends XmlAdapter<Object,Object>{
        @Override
        public Object marshal( Object arg0 ) throws Exception{ return arg0; }

        @Override
        public Object unmarshal( Object arg0 ) throws Exception{ return arg0; }
    }
}
