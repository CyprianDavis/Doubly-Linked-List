package davis.tech;



/**
 * 
 * @author CYPRIAN
 *
 */
public class Test {
	public static void main(String []args) {
	DoublyLinkedList<String> list = new DoublyLinkedList<>();
	list.addFirst("SSEREMBA");
	list.addLast("CYPRIAN");
	list.addLast("DAVIS");
	list.addLast("TUSUUBIRA");
	list.addLast("ANNET");
	
	list.printList();
	
	list.removeFirst();
	System.out.println();
	list.printList();
	
	list.removeLast();
	System.out.println();
	list.printList();
	
		
		
		
		
		
	
	}

}
