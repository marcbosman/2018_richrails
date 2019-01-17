package persistencyTest;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class main {
    public static void main(String[] args) {
    	XmlPersistency toXml = new XmlPersistency();
    	
    	Train train = new Train();
        train.setId(1);
        train.setName("Thomas");
        train.setSeats(10);
        
        //toXml.loadFromXML();
        toXml.saveToXML(train);
    }
}