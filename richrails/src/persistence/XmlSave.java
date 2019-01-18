package persistence;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import Train.*;

public class XmlSave implements Save {

	public static boolean XmlSave(Train train){
		boolean result = false;
		
		try {
			File file = new File("save.xml");
//	        JAXBContext jaxbContext = JAXBContext.newInstance(TrainController.class);
//	        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//	        
////	        QName qName = new QName("com.codenotfound.jaxb.model", "trainController", null, null);
////	        JAXBElement<TrainController> root =new JAXBElement<TrainController>(qName, TrainController.class, TrainController.getInstance());
////	        JAXBElement<TrainController> root =new JAXBElement<TrainController>(qName, TrainController.class, TrainController.getInstance());
//	        		
//	        QName qName = new QName("com.codenotfound.jaxb.model","trainController");
//	        JAXBElement<TrainController> root =new JAXBElement<TrainController>(qName, TrainController.class, TrainController.getInstance());
//	        
////	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
////	        jaxbMarshaller.marshal(new JAXBElement<TrainController>(new QName("uri","local"), TrainController.class, TrainController.getInstance()), System.out);		
//	        	
//	        jaxbMarshaller.marshal(root, file);
//	        //jaxbMarshaller.marshal(train, System.out);
//	        
//	        result = true;
//	        return result;
	        
	        
	        StringWriter stringWriter = new StringWriter();

	        JAXBContext jaxbContext = JAXBContext.newInstance(Train.class);
	        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

	        // format the XML output
	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
	            true);

	        QName qName = new QName("com.codenotfound.jaxb.model", "train");
	        JAXBElement<Train> root = new JAXBElement<>(qName, Train.class, train);

	        jaxbMarshaller.marshal(root, stringWriter);

	        String output = stringWriter.toString();
	        System.out.println(output);
	        result = true;
	        return result;
	        
		} catch (JAXBException e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public static TrainController XmlLoad() {
		try {
			File file = new File("save.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(TrainController.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//			Train train = (Train) jaxbUnmarshaller.unmarshal(file);
		    JAXBElement<TrainController> root =
		            jaxbUnmarshaller.unmarshal(new StreamSource(file), TrainController.class);
		        TrainController traincontroller = root.getValue();
			//System.out.println(train.getId());
		        System.out.println("YES:" + traincontroller.getAllTrains());;
	        return traincontroller;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}
}
