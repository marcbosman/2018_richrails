package persistence;


public class SavingFactory {
	public static Save getSave(String SaveType){
	      if(SaveType == null){
	         return null;
	      }		

	      if(SaveType.equalsIgnoreCase("XML")){
	         return new XmlSave();
	         	         
	      } 
	      
	      return null;
	   }
}
