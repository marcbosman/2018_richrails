package persistencyTest;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlPersistency {
	
	public boolean saveToXML(Train train) {
		boolean result = false;
		
		try {
			File file = new File("C:\\save.xml");
	        JAXBContext jaxbContext = JAXBContext.newInstance(Train.class);
	        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	        jaxbMarshaller.marshal(train, file);
	        //jaxbMarshaller.marshal(train, System.out);
	        
	        result = true;
	        return result;
		} catch (JAXBException e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public Train loadFromXML() {
		try {
			File file = new File("C:\\save.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Train.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Train train = (Train) jaxbUnmarshaller.unmarshal(file);
			//System.out.println(train.getId());
			
	        return train;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}
}
