package javastring;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sonalee";
		name = name+ "Sadamate";
		System.out.println("hello" + name);
		System.out.println(name.charAt(2));
		System.out.println(name.concat("Sadamate"));
		
		String s1 = "Sonalee";
		String s2 = "Sonalee";
		System.out.println(s1==s2);
		//mutable string- changed                       String buffer-is thread safe
		//immutable string - unchanged /bydefault string String Builder -is not thread safe
		
		//String buffer -  
		StringBuffer sb = new StringBuffer("Sonalee");
		sb.append("Sadamate");
		sb.deleteCharAt(3);
		sb.insert(0, "java");
		sb.setLength(30);
		sb.ensureCapacity(100);
		System.out.println(sb);

		
	}

}
