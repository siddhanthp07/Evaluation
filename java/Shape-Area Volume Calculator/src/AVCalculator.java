import java.util.*;

public class AVCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Triangle");
		double tbase = scn.nextDouble();
		double theight = scn.nextDouble();
		System.out.println("Sphere");
		double radius = scn.nextDouble();
		System.out.println("Rectangle");
		double rlength = scn.nextDouble();
		double rwidth = scn.nextDouble();
		System.out.println("Cube");
		double clength = scn.nextDouble();
		double cwidth = scn.nextDouble();
		double cheight = scn.nextDouble();
		System.out.println("Triangle");
		double tbase1 = scn.nextDouble();
		double theight1 = scn.nextDouble();
		Triangle t = new Triangle();
		t.setBase(tbase);
		t.setHeight(theight);
		System.out.println("Area "+ t.area());
		Sphere s = new Sphere();
		s.setRadius(radius);
		System.out.println("Area "+ s.area());
		System.out.println("Volume "+ s.volume());

		Rectangle r = new Rectangle();
		r.setLength(rlength);
		r.setWidth(rwidth);
		System.out.println("Area "+ r.area());
		
		Cube c = new Cube();
		c.setHeight(cheight);
		c.setLength(clength);
		c.setWidth(cwidth);
		System.out.println("Area "+ c.area());
		System.out.println("Volume "+ c.volume());
		
		t.setBase(tbase1);
		t.setHeight(theight1);
		System.out.println("Area "+ t.area());


		


	}

}
