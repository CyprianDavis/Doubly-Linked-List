package davis.tech;

/**
 * 
 * @author CYPRIAN
 *
 */

public class DoublyLinkedList<T> {
	private static class  Node<T>{
		private T element; //element stored at this node
		private Node<T>next;//reference to the subsequent node in the list
		private Node<T>prev;//reference to the previous node in the list
		
		//Constructor
		public Node(T e, Node<T>p, Node<T>n) {
			this.element = e;
			this.next = n;
			this.prev = p;
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
		public void setPrev(Node<T> p) {
			this.prev =p;
		}
		public void setNext(Node<T> n) {
			this.next = n;
		}	
	}
	//instance variables of the circularlyLinkedList
		private Node<T>head;//reference to the element stored at this node
		private Node<T>tail ; //references the last node in the list
		private int size =0; //number of nodes in the list
		//Constructor
		public DoublyLinkedList() {
			head = null;
			tail = null;
			
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
			if(isEmpty())
				return null;
			return this.head.getElement();
		}
		//returns but doesnot remove the last element in the list
		public T getLast() {
			if(isEmpty())
				return null;
			return this.tail.getElement();
		}
		
		/**
		 * Adds an element at the begining of the list
		 * @param e
		 */
		public void addFirst(T e) {
			Node<T> node = new Node<T>(e,null,null);
			if(isEmpty())
				head = tail = node;
				tail.setPrev(node);
			node.setNext(head);
			//new node becomes head
			head = node;
			size ++;//increament by 1
		}
			
		/**
		 * Adss an element at the end of the list
		 * @param e
		 */
		public void addLast(T e) {
			Node<T> node = new Node<>(e,null,null);
			if(isEmpty())
				head =tail= node;
				tail.setPrev(node);
			tail.setNext(node);
			node.setPrev(tail);
			//new node becomes tail
			tail = node;
			size++;
			}
		/**
		 * Removes and returns the first element in the list
		 * @return
		 */
		public T removeFirst() {
			//checks if the list is empty
			if(isEmpty()) 
				return null;
			//Store the element to remove
			T temp = head.getElement();
			head = head.getNext();
			size--;
			return temp;
			
		}
		/**
		 * Removes and returns the last element in the list
		 * @return
		 */
		public T removeLast() {
			//checks if the list is empty
			if(isEmpty())
				return null;
			//Store the element to remove
			T temp = tail.getElement();
			tail = tail.getPrev();
			tail.setNext(null);
			size--;
			
			return temp;
		}
		
		/**
		 * Prints all the elements in the list
		 */
		public void printList() {
			Node<T> runner;
			
			runner = head;
			
			while(runner!=null) {
				System.out.println(runner.getElement());
				runner = runner.next;
			}
		
		}
		

}
