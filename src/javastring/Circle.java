package javastring;

public abstract class Circle extends Shapes{

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Circle c= new Circle();
				c.drawShape();
				}

				@Override
				public void drawShape(){
				System.out.println("Drawing circle");//concrete method
				}

				@Override
				public void colorShape(){
				System.out.println("Drawing circle");
				}

				@Override
				public void moveShape(){
				System.out.println("Drawing circle");
	}

}
