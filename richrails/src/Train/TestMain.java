package Train;

public class TestMain {
	public static void main(String args[]) {
		ComponentFactory ComponentFactory = new ComponentFactory();
		
		Train t1 = new Train("testtrein");
		//Component comp1 = ComponentFactory.getComponent("locomotive");
		Component wag1 = ComponentFactory.getComponent("wagon");
		//t1.addComponent(comp1);
		t1.addComponent(wag1);
		System.out.println(t1.getAllComponents());
		
		
	}
}
