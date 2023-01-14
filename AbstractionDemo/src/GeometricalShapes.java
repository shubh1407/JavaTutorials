

interface Shape{
	
	void getArea();
	
}


class Triangle implements Shape{

	int side1;
	int side2;
	int side3;

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	
	@Override
	public void getArea() {
		double peri = (side1+side2+side3)/2;
		double area =  Math.sqrt(Math.abs((peri)*(peri-side1)*(peri-side2)*(peri-side3)));
		System.out.println("Area of triangle is "+area);	
	}
	
}


class EquilateralTriangle extends Triangle{

	public EquilateralTriangle(int sides) {
		super(sides, sides,sides);
		// TODO Auto-generated constructor stub
	}
	
}

class IsocelesTriangle extends Triangle{

	public IsocelesTriangle(int side1, int side2) {
		super(side1, side2, side2);
		// TODO Auto-generated constructor stub
	}
	
}

class Rectangle implements Shape{
	
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void getArea() {
		System.out.println("Area of Rectangle is "+length*breadth);
		
	}
	
}

class Square extends Rectangle{

	public Square(int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	
}



public class GeometricalShapes {

	public static void main(String[] args) {
		
		Shape shape = new Triangle(10, 20, 40);
		shape.getArea();
		
		Shape shape2 = new EquilateralTriangle(10);
		shape2.getArea();   
		
		Shape shape3= new IsocelesTriangle(10,20);
		shape3.getArea();
		
		Shape shape4 = new Rectangle(10, 20);
		
		shape4.getArea();
		
		Shape shape5 = new Square(20);
		shape5.getArea();
	}
}
