public class Circle2D
{
	private double x;
	private double y;
	private double radius;
	
	public Circle2D()
	{
		this.x=0;
		this.y=0;
		this.radius=1;
	}
	
	public Circle2D(double x, double y, double radius)
	{
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getArea()
	{
		return 3.1416*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 2*3.1416*radius;
	}
	
	public boolean contains (double x, double y)
	{
		if(Math.pow(Math.pow(this.x-x,2)+Math.pow(this.y-y,2),0.5)>this.radius) return false;
		
		return true;
	}
	
	public boolean contains (Circle2D circle)
	{
		if(Math.pow(Math.pow(this.x-circle.getX(),2)+Math.pow(this.y-circle.getY(),2),0.5)+circle.getRadius()>this.radius) return false;
		
		return true;
	}
	
	public boolean overlaps (Circle2D circle)
	{
		if(Math.pow(Math.pow(this.x-circle.getX(),2)+Math.pow(this.y-circle.getY(),2),0.5)>this.radius+circle.getRadius()) return false;
		
		return true;
	}
}
