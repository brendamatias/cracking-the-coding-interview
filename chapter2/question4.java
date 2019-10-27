package chapter2;

public class question4 {

	/*
	 * You have two numbers represented by a linked list, where each node contains a
	 * single digit. The digits are stored in reverse order, such that the 1’s digit
	 * is at the head of the list. Write a function that adds the two numbers and
	 * returns the sum as a linked list. EXAMPLE Input: (3 -> 1 -> 5) + (5 -> 9 ->
	 * 2) Output: 8 -> 0 -> 8
	 */
	static Node addsNumber(Node first, Node second) {
		Node res = null;
		Node prev = null;
		Node temp = null;
		int carry = 0, sum;

		while (first != null || second != null) {
			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;

			temp = new Node(sum);

			if (res == null) {
				res = temp;
			} else {
				prev.next = temp;
			}

			prev = temp;

			if (first != null) {
				first = first.next;
			}

			if (second != null) {
				second = second.next;
			}
		}

		if (carry > 0) {
			temp.next = new Node(carry);
		}

		return res;
	}

	public static void main(String[] args) {
		Node head = new Node(3);
		head.addToTail(1);
		head.addToTail(5);

		Node headTwo = new Node(5);
		headTwo.addToTail(9);
		headTwo.addToTail(2);

		head.printList(head);
		System.out.println("");
		head.printList(headTwo);

		System.out.println("");
		head.printList(addsNumber(head, headTwo));
	}

}
