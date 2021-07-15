package dataStructure.linkedlist;

public class MySingleLinkedList<T> {

	public Node<T> head;
	public int size;
	
	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst( T item) {
		Node<T> newNode = new Node<T>(item);
		
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>( item );
		temp.next = before.next;
		before.next = temp;
		size++;
	}
	
	public T removeFirst() throws Exception {
		if(head == null)
			return null;
		
		T temp = head.data;
		head = head.next;
		return temp;
	}
	
	public T removeAfter (Node<T> before) {
		if(before.next == null)
			return null;
		
		T temp = before.next.data;
		before.next = before.next.next;
		return temp;
	}
	public void add(int index, T item) {
		
	}
	
	public void remove( int index ) {
		
	}
	
	public int indexOf( T item ) {
		
		return -1;
	}
	
	public T get(int index) {
		return null;
	}
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>();
		
		list.add(0, "Saturday");
		list.add(1, "Friday");
	
		String str = list.get(1);
		list.remove(2);
	}
}
