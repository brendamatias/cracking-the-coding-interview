package chapter2;

public class question3 {
	/*
	 * Implement an algorithm to delete a node in the middle of a single linked
	 * list, given only access to that node. EXAMPLE Input: the node ‘c’ from the
	 * linked list a->b->c->d->e Result: nothing is returned, but the new linked
	 * list looks like a->b->d->e
	 */
	static void deleteNode(Node node) {
		Node temp = node.next;
		
		node.data = temp.data;
		node.next = temp.next;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		Node head = new Node(0);
		head.addToTail(1);
		head.addToTail(12);
		head.addToTail(1);
		head.addToTail(4);
		head.addToTail(1);

		System.out.println("Before Deleting ");
		head.printList(head);

		deleteNode(head.next);
		System.out.println("");
		System.out.println("After deleting ");
		head.printList(head);
	}
}
