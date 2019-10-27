package chapter2;

import java.util.HashSet;
import java.util.Set;

public class question1 {

	/*
	 * Write code to remove duplicates from an unsorted linked list. FOLLOW UP How
	 * would you solve this problem if a temporary buffer is not allowed?
	 */
	static void removeDuplicate(Node head) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(head.data);
		
		Node previous = head;
		Node current = previous.next;
		
		while (current != null) {
			if (!set.contains(current.data)) {
				set.add(current.data);
				previous = previous.next;
				current = current.next;
			} else {
				System.out.println("Delete " + current.data);
				current = current.next;
				previous.next = current;
			}
		}
	}

	public static void main(String args[]) {
		Node head = new Node(0);
		for (int i = 1; i < 11; i++) {
			head.addToTail(i);
		}
		
		head.addToTail(0);
		head.addToTail(0);
		head.addToTail(0);
		head.addToTail(8);
		head.addToTail(0);
		head.addToTail(8);
		
		removeDuplicate(head);
	
		head.printList(head);
	}
}
