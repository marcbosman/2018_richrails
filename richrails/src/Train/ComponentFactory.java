package Train;

public class ComponentFactory {
	
	   //use getComponent method to get object of type component
	   public static Component getComponent(String componentType, String name){
	      if(componentType == null){
	         return null;
	      }		

	      if(componentType.equalsIgnoreCase("LOCOMOTIVE")){
	         return new Locomotive(name);
	         	         
	      } else if(componentType.equalsIgnoreCase("WAGON")){
	         return new Wagon(name);
	         
	      }
	      
	      return null;
	   }
	}