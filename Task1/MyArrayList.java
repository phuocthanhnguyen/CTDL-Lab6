package Task1;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	public void growSize() {
		E[] temp = Arrays.copyOf(elements, elements.length);
		if (size == elements.length) {
			size = size * 2;
			System.arraycopy(temp, 0, elements, 0, temp.length);
		}
	}

	public int size() {
		
		return size;
	}

	public boolean isEmpty() {
		
		return size == 0;
	}

	public E get(int i) throws IndexOutOfBoundsException {

		return null;
	}

	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i > elements.length) {
			throw new IndexOutOfBoundsException();
		} else {
			elements[i] = e;
		}
		return null;
	}

	public boolean add(E e) {
		return false;
	}

	public int lastIndexOf(E e) {
		int result = -1;
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(e)) {
				result = i;
			}
		}
		return result;
	}

	public E[] toArray() {
		E[] result = (E[]) new Object[size];
		int i = 0;
		for (E e : result) {
			result[i] = e;
			i++;
		}
		return result;
	}

	public MyArrayList<E> clone() {
		MyArrayList<E> newList = new MyArrayList<>();
		newList.elements = elements.clone();
		newList.size = size;
		return newList;
	}

	public int indexOf(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o))
				return i;
		}
		return -1;
	}

	public boolean remove(E e) {
		int index = indexOf(e);
		if (index > -1) {
			for (int i = index; i < size; i++) {
				elements[i] = elements[i + 1];
				size--;
			}
			return true;
		}
		return false;
	}

	public void sort(Comparator<E> c) {
		E[] newElements = toArray();
		Arrays.sort(newElements, c);
	}

	public static void main(String[] args) {

	}
}
