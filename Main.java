import java.util.Scanner;

interface Polygon{
	void getName();
	void getNoOfSides();
	void getArea();
	void getPerimeter();
}

class Rectangle implements Polygon {
	int l,b;
	Rectangle(int len,int br){
		l = len;
		b = br;
	}
	public void getName() {
		System.out.println("Shape is Rectangle.");
	}
	public void getNoOfSides() {
		System.out.println("Rectangle has four sides.");
	}
	public void getArea() {
		System.out.println("Area of Rectangle: "+(l*b));
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle: "+(2*(l+b)));
	}
}

class Triangle implements Polygon {
	int base,height,a,b,c;
	Triangle(int b,int h){
		base = b;
		height = h;
	}
	Triangle(int s1,int s2,int s3){
		a=s1;
		b=s2;
		c=s3;
	}
	public void getName() {
		System.out.println("Shape is Triangle.");
	}
	public void getNoOfSides() {
		System.out.println("Triangle has Three Sides.");
	}
	public void getArea() {
		System.out.println("Area of Triangle: "+(0.5*(base*height)));
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Triangle: "+(a+b+c));
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth values: ");
		int len = s1.nextInt();
		int br = s1.nextInt();
		System.out.println("Enter 3 sides of a triangle: ");
		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = s1.nextInt();
		
		Rectangle r1 = new Rectangle(len,br);
		System.out.println();
		r1.getName();
		r1.getNoOfSides();
		r1.getArea();
		r1.getPerimeter();
		
		Triangle t1 = new Triangle(len,br);
		Triangle t2 = new Triangle(a,b,c);
		System.out.println();
		t1.getName();
		t1.getNoOfSides();
		t1.getArea();
		t2.getPerimeter();	
		s1.close();
	}
}
