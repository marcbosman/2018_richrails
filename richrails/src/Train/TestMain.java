package Train;

public class TestMain {
	public static void main(String args[]) {
		Train t1 = new Train("testtrein");
		ComponentFactory fact = new ComponentFactory();
		Component comp1 = fact.getComponent("locomotive");
		Component wag1 = fact.getComponent("wagon");
		t1.addComponent(comp1);
		t1.addComponent(wag1);
		System.out.println(t1.getAllComponents());
		
		
	}
}
