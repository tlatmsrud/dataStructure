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
	
	public T removeFirst() {
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
	
	/**
	 * index - 1번째 노드에 새로운 노드를 추가
	 * @param index
	 * @param item
	 */
	public void add(int index, T item) {
		// index > size인 이유는 마지막 인덱스 + 1번째에 추가할 수있기 때문.
		if(index < 0 || index > size) {
			return;
		}
		if(index == 0){
			addFirst(item);
		}else {
			Node<T> q = getNode(index - 1);
			addAfter(q, item);
		}
	}
	
	public T remove( int index ) {
		if(index < 0 || index >= size) {
			return null;
		}
		if(index == 0) {
			removeFirst();
		}
		
		Node<T> prev = getNode(index -1);
		return removeAfter(prev);
	}
	
	public T remove(T item) {
		
		Node<T> p = head;
		Node<T> q = null;
		
		while(p != null && !item.equals(p.data)) {
			q = p;
			p = p.next;
		}
		
		if(p == null) {
			return null;
		}
		if(q == null) {
			return removeFirst();
		}
		return removeAfter(q);
	}
	
	public int indexOf( T item ) {
		Node<T> p = head;
		int index = 0;
		
		while(p != null) {
			if(p.data.equals(item)) {
				return index;
			}
			p = p.next;
			index ++;
		}
		return -1;
	}
	
	public Node<T> getNode(int index) {
		if(index < 0 || index >= size) {
			return null;
		}
		Node<T> p = head;
		for(int i =0; i<index;i++) {
			p = p.next;
		}
		
		return p;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size) {
			return null;
		}
		return getNode(index).data;
	}
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>();
		
		list.add(0, "Saturday");
		list.add(1, "Friday");
	
		String str = list.get(1);
		list.remove(2);
	}
}
