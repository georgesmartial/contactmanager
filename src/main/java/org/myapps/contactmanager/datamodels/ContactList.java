package org.myapps.contactmanager.datamodels;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * The Class AddressBook.
 */
public class ContactList implements List<Contact> {

	/** The itr. */
	private Iterator<Contact> itr;

	/** The size. */
	int size = 0;

	/** The empty. */
	boolean empty;

	/** The data. */
	private Contact[] data;

	/** The i. */
	int i;

	/** The itr1. */
	Iterator<?> itr1;

	/**
	 * @see java.util.List#size()
	 * Returns the number of elements in this list.
	 */
	public int size() {
		return size;
	}

	/**
	 * @see java.util.List#isEmpty()
	 * Returns true if this list contains no elements.
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @see java.util.List#contains(java.lang.Object)
	 * @param o  Object o
	 * Verifies if the List contains a certain object
	 */
	public boolean contains(Object o) {
		try {
			for (int i = 0; i < size;) {
				if (o.equals(data[i])) {
					return true;
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @see java.util.List#iterator()
	 * Returns an iterator over the elements
	 * in this list in proper sequence.
	 */
	public Iterator<Contact> iterator() {
		return itr;

	}

	/**
	 * @see java.util.List#toArray()
	 * Returns an array containing all of the elements in this list in
	 * proper sequence (from first to last element).
	 */
	public Object[] toArray() {
		Contact[] array = new Contact[size];
		System.arraycopy(data, 0, array, size, data.length);
		return null;
	}

	/**
	 * @see java.util.List#toArray(java.lang.Object[])
	 * Returns an array containing all of the elements in this list in proper sequence
	 * (from first to last element); the runtime type of the returned array is that of
	 * the specified array. If the list fits in the specified array, it is returned therein.
	 * Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.
	 * If the list fits in the specified array with room to spare (i.e., the array has more elements than the list)
	 * , the element in the array immediately following the end of the collection is set to null.
	 * (This is useful in determining the length of the list only if the caller knows that the list does not contain any null elements.)
	 */
	@SuppressWarnings({ "hiding", "unchecked" })
	public <Contact> Contact[] toArray(Contact[] a) {
		if (a.length < size) {
			a = (Contact[]) Array.newInstance(a.getClass().getComponentType(),
					size);
		} else {
			if (a.length > size) {
				a[size] = null;
				System.arraycopy(data, 0, a, 0, size);
				return a;
			}
		}
		return null;
	}

	/**
	 * @see java.util.List#add(java.lang.Object)
	 * Appends the specified element to the end of this list.
	 */
	public boolean add(Contact e) {
		if (size == data.length) {
			Contact[] bigger = new Contact[size * 2];
			System.arraycopy(data, 0, bigger, 0, bigger.length);
			data = bigger;
		}
		data[size] = e;
		return true;
	}

	/**
	 * @see java.util.List#remove(java.lang.Object)
	 *Removes the first occurrence of the specified
	 *element from this list, if it is present.
	 */
	public boolean remove(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++) {
				if (o == null) {
					data[i] = null;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			if (o.equals(data[i])) {
				data[i] = null;
				return true;
			}
		}
		return false;
	}

	/**
	 * @see java.util.List#containsAll(java.util.Collection)
	 * Returns true if this list contains all of the elements
	 *  of the specified collection
	 */
	public boolean containsAll(Collection<?> c) {
		itr1 = c.iterator();
		for (i = 0; i < size; i++) {
			while (itr1.hasNext()) {
				if (!contains(itr1.next())) {
					return false;
				} else {
					return true;
				}
			}
		}
		return data != null;
	}

	/**
	 * @see java.util.List#addAll(java.util.Collection)
	 * Appends all of the elements in the specified collection
	 *  to the end of this list, in the order that they are returned
	 *   by the specified collection's Iterator.
	 */
	public boolean addAll(Collection<? extends Contact> c) {
		Object[] a = c.toArray();
		int numNew = a.length;
		System.arraycopy(a, 0, data, size, numNew);
		size += numNew;
		return numNew != 0;
	}

	/**
	 * @see java.util.List#addAll(int, java.util.Collection)
	 * Inserts all of the elements in the specified collection
	 * into this list, starting at the specified position.
	 */
	public boolean addAll(int index, Collection<? extends Contact> c) {
		Iterator<? extends Contact> itr = c.iterator();
		int csize = c.size();
		int end = index + csize;
		if (size > 0 && index != size) {
			System.arraycopy(data, index, data, end, size - index);
		}
		size += csize;
		for (; index < end; index++) {
			data[index] = itr.next();
		}
		return (csize > 0);
	}

	/**
	 * @see java.util.List#removeAll(java.util.Collection)
	 * Removes from this list all of its elements that are
	 * contained in the specified collection.
	 */
	public boolean removeAll(Collection<?> c) {
		if (c == null) {
			throw new NullPointerException();
		}
		int i;
		for (i = 0; i < size; i++) {
			if (c.contains(data[i])) {
				data[i] = null;
			} else {
				if (i == size) {
					return false;
				}
			}
		}
		return empty;
	}

	/**
	 * @see java.util.List#retainAll(java.util.Collection)
	 * Retains only the elements in this list that are contained in the specified collection
	 */
	public boolean retainAll(Collection<?> c) {
		if (c == null) {
			throw new NullPointerException();
		}

		int i;
		int j;
		for (i = 0; i < size; i++) {
			if (!c.contains(data[i])) {
				break;
			}
		}
		if (i == size) {
			return false;
		}
		for (j = i++; i < size; i++) {
			if (c.contains(data[i])) {
				data[j++] = data[i];
			}
		}
		size -= i - j;
		return true;
	}

	/**
	 * @see java.util.List#clear()
	 * Removes all of the elements from this list.
	 */
	public void clear() {
		// Let gc do its work
		for (int i = 0; i < size; i++) {
			data[i] = null;
		}

		size = 0;
	}

	/**
	 * @see java.util.List#get(int)
	 * Returns the element at the specified position in this list.
	 */
	public Contact get(int index) {
		data = new Contact[0];
		if (index < size) {
			return data[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * @see java.util.List#set(int, java.lang.Object)
	 * Replaces the element at the specified position in this list with the specified element.
	 */
	public Contact set(int index, Contact element) {
		data = new Contact[0];
		if (index < size) {
			data[index] = element;
			return data[index];
		} else {
			return null;
		}
	}

	/**
	 * @see java.util.List#add(int, java.lang.Object)
	 * Inserts the specified element at the specified
	 *  position in this list
	 */
	public void add(int index, Contact element) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("" + index);
		}

		// check if array is full
		if (size == data.length) {
			// make a bigger array
			Contact[] bigger = new Contact[size * 2];

			// copy elements before the position at which to add
			System.arraycopy(data, 0, bigger, 0, index);

			// copy elements after the position at which to add
			System.arraycopy(data, index, bigger, index + 1, size - index);

			// use bigger array
			data = bigger;
		} else {
			// copy all elements after the position at which to add over 1
			for (int copyFrom = size - 1; copyFrom >= index; copyFrom--) {
				data[copyFrom + 1] = data[copyFrom];
			}
		}

		// add the new element
		data[index] = element;
		size++;

	}

	/**
	 * @see java.util.List#remove(int)
	 * Removes the element at the specified position in this list.
	 */
	public Contact remove(int index) {
		if (index < size) {
			Contact obj = data[index];
			data[index] = null;
			int tmp = index;
			while (tmp < size) {
				data[tmp] = data[tmp + 1];
				data[tmp + 1] = null;
				tmp++;
			}
			size--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * @see java.util.List#indexOf(java.lang.Object)
	 * Returns the index of the first occurrence of the specified element in this list,
	 *  or 0 if this list does not contain the element
	 */
	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (o.equals(data[i])) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * @see java.util.List#lastIndexOf(java.lang.Object)
	 * Returns the index of the last occurrence of the specified
	 * element in this list, or -1 if this list does not contain the element.
	 */
	public int lastIndexOf(Object o) {
		if (o == null) {
			for (int i = size - 1; i >= 0; i--) {
				if (data[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = size - 1; i >= 0; i--) {
				if (o.equals(data[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * @see java.util.List#listIterator()
	 * Returns a list iterator over the elements
	 * in this list (in proper sequence).
	 */
	public ListIterator<Contact> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see java.util.List#listIterator(int)
	 * Returns a list iterator over the elements in this list (in proper sequence),
	 * starting at the specified position in the list.
	 */
	public ListIterator<Contact> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see java.util.List#subList(int, int)
	 * Returns a view of the portion of this list between the specified
	 * fromIndex, inclusive, and toIndex, exclusive.
	 */
	public List<Contact> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
