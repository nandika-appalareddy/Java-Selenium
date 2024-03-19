package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("AppalaReddy");
		list1.add("Narendra");
		list1.add("Hari");
		list1.add("Vamshi");
		list1.add("Nikhil");
		System.out.println(list1.get(3));
		list1.remove(3);
		System.out.println(list1.get(3));
		list1.add(3, "Gandhi");
		System.out.println(list1.indexOf("Nikhil"));
		System.out.println(list1.contains("Prasanth"));
		list1.add("Prasanth");
		System.out.println(list1.size());
		System.out.println("\n");
		
		Iterator<String> it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
