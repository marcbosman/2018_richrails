package xml_test;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
    	XmlPersistency toXml = new XmlPersistency();
    	TrainController tc = new TrainController();
    	
    	Train t = new Train();
        t.setId(1);
        t.setName("Thomas");
        t.setSeats(10);
        
        Wagon w = new Wagon();
        w.setName("Wagonnetje");
        w.setSeats(22);
        t.addWagon(w);
        
        Wagon w2 = new Wagon();
        w2.setName("Wagonnetje2");
        w2.setSeats(20);
        t.addWagon(w2);
        
        Train t2 = new Train();
        t2.setId(1);
        t2.setName("Marc");
        t2.setSeats(15);
        
        Wagon w3 = new Wagon();
        w3.setName("Wagonnetje3");
        w3.setSeats(22);
        t2.addWagon(w3);
        
        Wagon w4 = new Wagon();
        w4.setName("Wagonnetje4");
        w4.setSeats(20);
        t2.addWagon(w4);
        
        tc.addTrain(t);
        tc.addTrain(t2);
        
        toXml.loadFromXML();
        //toXml.saveToXML(tc);
    }
}