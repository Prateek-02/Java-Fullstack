package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListInterface {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args){
		ArrayList l1 = new ArrayList();
		l1.add("Raw type collection");
		l1.add(20);
		l1.add("Java");
		l1.add(95.9);
		l1.add(true);
		
		
		Iterator it = l1.iterator();
		System.out.println("Printing all elements: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		it.remove(); // it will remove the last element from the list
		System.out.println("\nPrinting after removing last element using iterator: ");
		System.out.println(l1);
		
		
		l1.remove(1);  // it will remove the given index from the list
		System.out.println("\nPrinting after removing the given in remove function index from list: ");
		System.out.println(l1);
		
		
		
		
		LinkedList l2 = new LinkedList();
		l2.add(l1);
		l2.add("Hello world");
		
		Iterator it2 = l2.iterator();
		System.out.println("\nPrinting the linked list after adding l1 object to it: ");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		l2.remove(0);
		System.out.println("\nPrinting after removing the given index in remove function from linked list: ");
		System.out.println(l2);  // it will print linked list in one go
	}
}
