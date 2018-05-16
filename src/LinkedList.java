public class LinkedList {
	private Node head;
	private Node current;
	public int count;

	public LinkedList() {
		head = new Node();
		current = head;
	}

	public void addAtStart(Object data) {
		Node newNode = new Node();
		newNode.value = data;
		newNode.next = head.next; // new node will have a reference of the head's next reference
		head.next = newNode; // now the head will refer to the newNode
		count++;

	}

	public void removeFromStart() {
		if (count == 1) {
			head = null;
			current = null;
			count = 0;
		}
		if (count > 1) {
			head = head.next;
			count--;
		} else {
			System.out.println("There are no elements in the list!");
		}
	}

	public void printAllNodes() {
		System.out.println("Head ->");
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value);
			System.out.println("->");
		}
		System.out.println("NULL");
	}

	public void removeAll(Object o) {
		Node curr = head;
		while (curr.next != null) {
			if (curr.next.value == o) {
				curr.next = curr.next.next;
				count--;
			}
			curr = curr.next;
		}
	}

	public void printReverse() {
		// If you have reached the end of your list then return
		if (head == null) {
			System.out.println("null");
		}
		printReverseRecursive(head);
	}

	private void printReverseRecursive(Node node) {
		if (node == null) {
			return;
		}
		printReverseRecursive(node.next);
		System.out.print(node.value + " ");
	}

}