package doodle;

import java.util.EmptyStackException;

class Stack<T>{
	
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return null;
	}
	
	T item = top.data;
	top = top.next;
	return item;
	
}

public class Test {
	
	public static void main(String[] arsg) {
		
	}

}
