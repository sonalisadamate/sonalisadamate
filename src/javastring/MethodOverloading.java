package javastring;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.login(634, "password");
		mo.login("sonalee", "raj");

		}
		public void login(String s, String p)
		{
		System.out.println("Login successful using username and password");
		}
		public void login(int i, String p)
		{
		System.out.println("Login successful using phonenumber and password");

	}

}
