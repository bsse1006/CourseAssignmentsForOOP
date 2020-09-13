import javax.swing.JOptionPane;

public class MainClass
{
	public static void main (String [] args)
	{
		Circle2D c1 = new Circle2D (2,2,5.5);
		JOptionPane.showMessageDialog(null, c1.getArea());
		JOptionPane.showMessageDialog(null, c1.getPerimeter());
		JOptionPane.showMessageDialog(null, c1.contains(3,3));
		JOptionPane.showMessageDialog(null, c1.contains(new Circle2D (4,5,10.5)));
		JOptionPane.showMessageDialog(null, c1.overlaps(new Circle2D (3,5,2.3)));
	}
}
