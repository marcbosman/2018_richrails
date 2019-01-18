package xml_test;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

public class Train {

    private String name;
    private int seats;
    private int id;
    private ArrayList<Wagon> wagons = new ArrayList<Wagon>();

    public ArrayList<Wagon> getWagons() {
		return wagons;
	}
    
    @XmlElementWrapper(name="wagons")
    @XmlElement(name="wagon")
	public void setWagons(ArrayList<Wagon> wagons) {
		this.wagons = wagons;
	}
	
	public void addWagon(Wagon w) {
		wagons.add(w);
	}

	public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    @XmlElement
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

} 