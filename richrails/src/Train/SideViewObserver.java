package Train;

public class SideViewObserver extends Observer {
	
	public SideViewObserver(Train train){
	      this.train= train;
	      this.train.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( train.getState()); 
	   }
}
