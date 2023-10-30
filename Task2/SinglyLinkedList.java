package Task2;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size;

	public SinglyLinkedList() {
		super();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getData();
		}
	}

	public E last() {
		if (isEmpty())
			return null;
		return tail.getData();
	}

	public void addFirst(E e) {
		Node<E> newNode = new Node<>(e);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

		size++;
	}

	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);

		if (tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public E removeFirst() {
		if (head == null) {
			throw new NoSuchElementException("The list is empty");
		}

		E removedData = head.data;
		head = head.next;

		if (head == null) {
			tail = null;
		}

		size--;
		return removedData;
	}

	public E removeLast() {
		if (head == null) {
			throw new NoSuchElementException("The list is empty");
		}

		E removedData;
		if (head.next == null) {
			removedData = head.data;
			head = null;
			tail = null;
		} else {
			Node<E> current = head;
			while (current.next.next != null) {
				current = current.next;
			}

			removedData = current.next.data;
			current.next = null;
			tail = current;
		}

		size--;
		return removedData;
	}

	public static void main(String[] args) {

	}

}
