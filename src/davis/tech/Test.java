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
	list.addLast("ISAAC E");
	
	System.out.println(list.getFirst());
	
	System.out.println(list.getLast());
	
	System.out.println();
	
	list.printList();
		
	
	}

}
