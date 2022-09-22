
public class Rectangle extends Shape {

	private double length,width;
	
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	double area() {
		return length * width;
		// TODO Auto-generated method stub
		
	}

	@Override
	double volume() {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
