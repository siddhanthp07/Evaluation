
public class Cube extends Shape {
private double length,width,height;
	
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	double area() {
		return (2*length * width)+(2*length*height)+ (2*width*height);
		
	}

	@Override
	double volume() {
		return length*width*height;
		
	}
}
