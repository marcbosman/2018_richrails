package xml_test;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlPersistency {
	
	public boolean saveToXML(TrainController tc) {
		boolean result = false;
		
		try {
			File file = new File("C:\\Users\\Marc\\richrail_2018\\xml_test\\src\\xml_test\\save.xml");
	        JAXBContext jaxbContext = JAXBContext.newInstance(TrainController.class);
	        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	        jaxbMarshaller.marshal(tc, file);
	        jaxbMarshaller.marshal(tc, System.out);
	        
	        result = true;
	        return result;
		} catch (JAXBException e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public TrainController loadFromXML() {
		try {
			File file = new File("C:\\Users\\Marc\\richrail_2018\\xml_test\\src\\xml_test\\save.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(TrainController.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			TrainController tc = (TrainController) jaxbUnmarshaller.unmarshal(file);
			System.out.println(tc.getAllTrains());
			
	        return tc;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}
}
