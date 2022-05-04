package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int ERR_EMPTY = -1;
	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERR_EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return ERR_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	private static class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			this.value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
