package dataStructure.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
			iter.remove();
			System.out.println(list.size());
		}
		
	}
}
