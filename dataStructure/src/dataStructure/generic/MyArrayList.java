package dataStructure.generic;

import java.util.Arrays;

public class MyArrayList <T>{

	private static final int INIT_CAPACITY = 10;
	private T[] theData;
	private int size;
	private int capacity = INIT_CAPACITY;
	
	public MyArrayList(){
		theData = (T []) new Object [INIT_CAPACITY];
		size = 0;
	}
	
	public void add(int index, T anEntry) {
		
		if( index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if( size >= capacity) 
			reallocate();
		
		for(int i = size-1; i>= index ; i--) {
			theData[i+1] = theData[i];
		}
		theData[index] = anEntry;
		size++;
	}

	private void reallocate() {
		// TODO Auto-generated method stub
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
	}

	public void add(T anEntry) {
		add(size, anEntry);
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf( T anEntry) {
		for( int i =0; i<size; i++) {
			if(theData[i].equals(anEntry)) {
				return i;
			}
		}
		return -1;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return theData[index];
	}
	
	public T set(int index, T newValue) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		T oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}
	
	public T remove(int index) {
		if(index < 0 || index >= size) {
			 throw new ArrayIndexOutOfBoundsException(index);
		}
		
		T oldValue = theData[index];
		for(int i = index +1; i<size ; i++) {
			theData[i-1] = theData[i];
		}
		size--;
		return oldValue;
	}
	
}
