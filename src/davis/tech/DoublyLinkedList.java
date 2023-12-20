package davis.tech;

/**
 * 
 * @author CYPRIAN
 *
 */

public class DoublyLinkedList<T> {
	private class Node<T>{
		private T element; //element stored at this node
		private Node<T>next;//reference to the subsequent node in the list
		private Node<T>prev;//reference to the previous node in the list
		
		//Constructor
		public Node(T e) {
			this.element = e;
		}
		//returns element stored at this node
		public T getElement() {
			return this.element;	
		}
		
		public Node<T> getNext(){
			return this.next;
		}
		public Node<T> getPrev(){
			return this.prev;
			
		}
		public void setPrev(Node<T> e) {
			this.prev =e;
		}
		public void setNext(Node<T> e) {
			this.next = e;
		}	
	}
	//instance variables of the circularlyLinkedList
		private Node<T>head;//reference to the element stored at this node
		private Node<T>tail; //references the last node in the list
		private int size =0; //number of nodes in the list
		//Constructor
		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;	
		}
		//returns true if the list is empty or otherwise
		public boolean isEmpty() {
			return size ==0;
		}
		//returns the number of elements in the list
		public int getSize() {
			return this.size;
		}
		//returns but doesnot remove the first element in the list
		public T getFirst() {
			return this.head.getElement();
		}
		//returns but doesnot remove the last element in the list
		public T getLast() {
			return this.tail.getElement();
		}

}
