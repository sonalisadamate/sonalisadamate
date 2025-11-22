package javastring;

import java.util.HashMap;
import java.util.Map;

public class duplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "automation";

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    if (entry.getValue() > 1) {
		        System.out.println(entry.getKey());
		    }
		}
	}

}
