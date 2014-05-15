package org.myapps.contactmanager.datamodels;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AddressBookTest {
	Contact[] data, newData;
	Contact e;
	int i, size;
	Object o;

	@Test
	public void testSize() {
		assertTrue("size =" + size, true);
	}

	@Test
	public void testIsEmpty() {
		if (size == 0) {

		}
	}

	@Test
	public void testContains() throws NullPointerException {
		o = new Object();
		try {
			assertEquals("Objects are equal", o, data[i]);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}

	@Test
	public void testToArray() {
		assertArrayEquals("Lists are equal", newData, data);
	}

	@Test
	public void testToArrayContactArray() {
		assertArrayEquals("Lists are equal", newData, data);
	}

	@Test
	public void testAddContact() {
		Contact e = null;
		try {
			assertEquals(data[size], e);
		} catch (NullPointerException a) {
			a.printStackTrace();
		}
	}

	@Test
	public void testRemoveObject() {
		try {
			assertNull(data[i]);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testContainsAll() {

		for (i = 0; i < size; i++) {
			if (newData == data) {
				assertTrue(true);
			}
		}
	}

	@Test
	public void testAddAllCollectionOfQextendsContact() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAllIntCollectionOfQextendsContact() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveAll() {
		assertNull(data);
	}

	@Test
	public void testRetainAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		assertNull(data);
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddIntContact() {
		Contact e = null;
		try {
			assertEquals(data[size], e);
		} catch (NullPointerException a) {
			a.printStackTrace();
		}
	}

	@Test
	public void testRemoveInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testLastIndexOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testListIterator() {
		fail("Not yet implemented");
	}

	@Test
	public void testListIteratorInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubList() {
		fail("Not yet implemented");
	}

}
