package javastring;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo md = new MethodsDemo();
		md.doLogin();
		md.dologout();//we can call it multiple times.
		System.out.println(md.addNumbers(5, 10));
		md.diffParameters("hello hi", 12, 23);
		}
		//public int dologin() when you return something. 
		//return 10;
		//public string dologin()
		//return "abc";

		public void doLogin()
		{ //start
		//login code
		System.out.println("Login Successful");
		}//end
		public void dologout()
		{
		doLogin();
		System.out.println("Logout Successful");
		}
		public int addNumbers(int x, int y)//-parameters
		{
		//int z = x+y;
		//return z;
		return x+y;
		}
		public void diffParameters(String s, int i, float f)
		{
		System.out.println(s);
		System.out.println(i);
		System.out.println(i);
		}

	

}
