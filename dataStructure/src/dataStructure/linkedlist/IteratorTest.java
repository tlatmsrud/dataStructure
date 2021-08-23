package dataStructure.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0;i <= 100; i++) {
			list.add(i);
		}
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			int data = iter.next();
			System.out.print(data);
		}	
	}
	
	public void linkedListTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i = 0;i <= 100; i++) {
			list.add(i);
		}
		
		for(int i = 0; i<= 100; i++) {
			list.get(i);
		}
	}
}
