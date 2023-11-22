package projday3;

interface Area{
	double pi = 3.14;
	public void calArea();
}

interface Volume{
//	double pi = 3.14;
	public void calVolume();
}

interface Perimeter extends Area,Volume{
	public void calPerimeter();
}

class Circle implements Perimeter{
	double r;
	public void calArea() {
		System.out.println("Area of circle: "+pi*r*r);
	}
	public void calPerimeter() {
		System.out.println("Perimeter of circle: "+2*pi*r);
	}
	public void calVolume() {
		System.out.println("Volume of circle: "+2*pi*r);
	}
}

class Rectangle implements Area,Perimeter{
	double l,h;
	public void calArea() {
		System.out.println("Area of rectangle: "+l*h);
	}
	public void calPerimeter() {
		System.out.println("Perimeter of rectangle: "+2*(l*h));
	}
	public void calVolume() {
		System.out.println("Volume of rectanlge: "+2*l);
	}
}

class Square implements Perimeter{
	double s;
	public void calArea() {
		System.out.println("Area of square: "+s*s);
	}
	public void calPerimeter() {
		System.out.println("Perimeter of square: "+4*s);
	}
	public void calVolume() {
		System.out.println("Volume of square: "+2*s);
	}
}

class Triangle implements Perimeter{
	double a,b,c,h1;
	public void calArea() {
		System.out.println("Area of triangle: "+0.5*b*h1);
	}
	public void calPerimeter() {
		System.out.println("Perimeter of triangle: "+(a+b+c));
	}
	public void calVolume() {
		System.out.println("Volume of triangle: "+2*a);
	}
}

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ar = new Circle();
		ar.r=10;
		ar.calArea();
		ar.calPerimeter();
		ar.calVolume();
		Rectangle rec = new Rectangle();
		rec.l=2;
		rec.h=3;
		rec.calArea();
		rec.calPerimeter();
		rec.calVolume();
		Square sq = new Square();
		sq.s=5;
		sq.calArea();
		sq.calPerimeter();
		sq.calVolume();
		Triangle tr = new Triangle();
		tr.a=2;
		tr.b=4;
		tr.c=10;
		tr.h1=5;
		tr.calArea();
		tr.calPerimeter();
		tr.calVolume();
//		rec.calArea();

	}

}
