package javastring;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		String rev = new StringBuilder(s).reverse().toString();
		
		if(s.equals(rev))
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
