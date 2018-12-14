package Train;

import javax.swing.JPanel;

public interface Observer {
	public abstract void update();
	public abstract void drawLocomotive(JPanel drawPanel);
	public abstract void drawWagon(Wagon wagon, JPanel drawPanel);
}
