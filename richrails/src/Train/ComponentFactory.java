package Train;

public class ComponentFactory {
	
	   //use getShape method to get object of type shape 
	   public Component getComponent(String componentType){
	      if(componentType == null){
	         return null;
	      }		

	      if(componentType.equalsIgnoreCase("LOCOMOTIVE")){
	         return new Locomotive();
	         
	      } else if(componentType.equalsIgnoreCase("WAGON")){
	         return new Wagon();
	      }
	      
	      return null;
	   }
	}