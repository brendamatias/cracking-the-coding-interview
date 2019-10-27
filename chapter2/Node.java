package chapter2;

public class Node {
	int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public void addToTail(int d) {
		Node node = new Node(d);
		Node current = this;

		while (current.next != null) {
			current = current.next;
		}

		current.next = node;
	}

	public void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
