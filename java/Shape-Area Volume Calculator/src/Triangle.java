
public class Triangle extends Shape {
private double base,height;
	
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	double area() {
		return 0.5* base* height;

	}

	@Override
	double volume() {
		return 0;
		
	}
}
