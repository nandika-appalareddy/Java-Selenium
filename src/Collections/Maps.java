package Collections;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Maps {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Gopal");
		map.put(2, "Raju");
		map.put(3,  "Krishna");
		map.put(4,  "Govind");
		map.put(6,  "Narayana");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("\n");
		map.remove(4);
		
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("\n");
		map.replace(6, "Avinash");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
