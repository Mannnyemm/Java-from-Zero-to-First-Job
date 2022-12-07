package com.manny.javacollections;

public class DefaultMyList implements MyList {
	// Pointer to Head of node
	private Node first;
	// Pointer to Tail of node
	private Node last;
	// Size of list
	private int size;
	
	/**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     */
	 @Override
	 public void add(Object e) {
		// Exit function if e is null
		if (e == null) {
			return;
		}
		// Create a new node and set it to first and last if first is null or list is empty
		if (first == null) { 
			Node newNode = new Node(null, e, null);
			first = newNode;
			last = newNode;
		}
		// Add new node to the Linkedlist and set last to it
		else {
			Node newNode = new Node(last, e, null);
			last.next = newNode;
			last = newNode;
		}
		size++;
	 }
	 
	/**
	 * Removes all of the elements from this list.
	 * The list will be empty after this call returns.
	 */
	 @Override
	 public void clear() {
		 for (Node x = first; x != null;) {
			 Node next = x.next;
			 x.value = null;
			 x.next = null;
			 x.prev = null;
			 first = null;
			 last = null;
			 x = next;
		 }
		 last = null;
		 first = null;
		 size = 0;
	 }
	 
	 
	/**
	 * Removes the first occurrence of the specified element from this list,
	 * if it is present.  If this list does not contain
	 * the element, it is unchanged. 
	 *
	 * @param o element to be removed from this list, if present
	 * @return true if this list contained the specified element
	 * @throws NullPointerException if the specified element is null and this
	 *         list does not permit null elements
	 */
	 @Override
	 public boolean remove(Object o) {
		 if (o == null) {
			 throw new NullPointerException();
		 }
		 for (Node x = first; x != null;) {
			 Node nextNode = x.next;
			 if (x.value.equals(o)) {
				 Node prev = x.prev;
				 Node next = x.next;
				 if (prev != null) {					 
					 prev.next = next;
				 }
				 if (prev == null) {
					 first = next;
				 }
				 if (next == null) {
					 last = prev;
				 }
				 if (next != null) {					 
					 next.prev = prev;
				 }
				 x.value = null;
				 x.next = null;
				 x.prev = null;
				 size--;
				 return true;
			 }
			 x = nextNode;

		 }
		 return false;
	 }
	
	 
	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element).
	 * 
	 * This method acts as bridge between array-based and collection-based
	 * APIs.
	 *
	 * @return an array containing all of the elements in this list in proper
	 *         sequence
	 */
	 
	
	 @Override 
	 public Object[] toArray() {
		 Object[] result = new Object[size];
		 int index = 0;
		 for (Node x = first; x != null;) {
			 Node next = x.next;
			 result[index++] = x.value;
			 x = next;
		 }
		 return result;
		 
	 }
	
	 
	/**
	 * Returns the number of elements in this list.  If this list contains
	 * more than Integer.MAX_VALUE elements, returns
	 * Integer.MAX_VALUE.
	 *
	 * @return the number of elements in this list
	 */
	 @Override
	 public int size() {
		 return size;
	 }
	 
	/**
	 * Returns true if this list contains the specified element.
	 * More formally, returns true if and only if this list contains
	 * at least one element e such that.
	 *
	 * @param o element whose presence in this list is to be tested
	 * @return true if this list contains the specified element
	 * @throws NullPointerException if the specified element is null and this
	 *         list does not permit null elements
	 */
	 
	 // returns true if this list contains the specified element.
	 @Override
	 public boolean contains(Object o) {
		 if (o == null) {
			 throw new NullPointerException();
		 }
		 for (Node x = first; x != null;) {
			 Node nextNode = x.next;
			 if (x.value.equals(o)) {
				 return true;
			 }
			 x = nextNode;
		 }
		 return false;
	 }
	
	/**
	 * Returns true if this list contains all of the elements of the
	 * specified collection.
	 *
	 * @param  c object that implements MyList to be checked for containment in this list
	 * @return true if this list contains all of the elements of the
	 *         specified collection
	 * @throws NullPointerException if the specified collection contains one
	 *         or more null elements and this list does not permit null
	 *         elements
	 */
	 // returns true if this list contains all of the elements of the specified list
	 @Override
	 public boolean containsAll(MyList c) {
		 Object[] array = c.toArray();
		 
		 for (int i = 0; i < array.length; i++) {
			 if (!contains(array[i])) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 
	 
	 @Override
	public String toString() {
		String result = "{";
		for (Node x = first; x != null;) {
			result += x.toString();
			x = x.next;
		}
		return result;
	}



	private static class Node{
		 // Next node
		 private Node next;
		 // Previous node
		 private Node prev;
		 //
		 private Object value;
		 
		 public Node(Node prev, Object value, Node next) {
			 this.prev = prev;
			 this.value = value;
			 this.next = next;
		 }

		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
		 
		 
	 }
}
