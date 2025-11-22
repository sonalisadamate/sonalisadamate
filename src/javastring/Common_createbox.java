package javastring;

public class Common_createbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Common_createbox cm = new Common_createbox();
		//int h =cm.height=10; //defined in another class
		//int l=cm.length=20;
		//int b=cm.width=30;

		int b=cm.setwidth(10);
		int h=cm.setHeight(15);
		int l=cm.setLength(20);


		cm.setBoxDimension(l, b, h);
		System.out.println(cm.getLength());
}
}
