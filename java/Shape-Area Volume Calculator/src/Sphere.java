
public class Sphere extends Shape{
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 4*3.14159 * radius*radius;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return (4*3.14159*radius*radius*radius)/3;
	}

}
