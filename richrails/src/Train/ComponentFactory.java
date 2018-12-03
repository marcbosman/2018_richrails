package Train;

public class ComponentFactory {
	
	   //use getShape method to get object of type shape 
	   public Component getComponent(String componentType){
	      if(componentType == null){
	         return null;
	      }		
	      /// WERKT PAS ALS SUPER/SUBSTRUCTUUR ER IS
//	      if(componentType.equalsIgnoreCase("LOCOMOTIVE")){
//	         return new Locomotive();
//	         
//	      } else if(componentType.equalsIgnoreCase("WAGON")){
//	         return new Wagon();
//	      }
	      
	      return null;
	   }
	}