package pa03;

import java.util.*;

/**
 * This Class creates a PersonLinked List with a head and tail. The class
 * includes methods to add a Person to the list, delete a specific person from
 * the list, and finding a person.
 * 
 * @author - James Nguyen
 *
 */
public class PersonLinkedList {
	private PersonNode head; // Linked list Empty if head and
	private PersonNode tail; // tail are null

	/***
	 * method which inserts a person into the linked list by turning it into a node
	 * and adding it to the head
	 * 
	 * @param person
	 *            - person that will be added to the linked list
	 */
	public void insert(Person person) {

		PersonNode node = new PersonNode(person); // creating a person Node from the person parameter
		node.setNext(head);// setting the node as the head since it is inserted at the head
		head = node;
		if (tail == null)
			tail = node; // Corner case: inserting into empty node

	}

	/***
	 * method which will return the ArrayList version of the linked List. This will
	 * be helpful when using this linked List as a friends list to print each friend
	 * 
	 * @return - an arraylist of people from the linked list
	 */
	public ArrayList<Person> linkedToArray() {
		ArrayList<Person> personList = new ArrayList<Person>(); // creating a personList
		PersonNode node = head;
		while (node != null) { // iterating through the linked list and adding it to the array list
			personList.add(node.getData());
			node = node.getNext();
		}
		return personList; // returning the arraylist

	}

	/***
	 * method which will delete a specific person from the linked list
	 * 
	 * @param person
	 *            - the person which will be deleted
	 */
	public void delete(Person person) {
		PersonNode node = head;
		PersonNode prevNode = null;
		while (node != null) {
			if (node.getData().getName().equals(person.getName())) { // iterating through the linked list until there is
																		// a node that equals to the person
				break;
			}
			prevNode = node;
			node = node.getNext();
		}
		if (node == null) {// if the person is not found, then dont do anything
			// do nothing
		} else if (head == node && tail == node) { // if the node is the only node in the linked list
			head = null;
			tail = null;
		} else if (head == node) { // if the node is the head of the linked list
			head = node.getNext();
		} else if (tail == node) { // if the node is the tail of the linked list
			tail = prevNode;
			prevNode.setNext(null);
		} else { // if the node is in the middle of the linkedlist
			prevNode.setNext(node.getNext());
		}
	}

	/***
	 * method which will find a specific person node based on the given string
	 * 
	 * @param name
	 *            - the name that will be used to search for the node throughout the
	 *            list
	 * @return - the node if the matched node is found or null if there is nothing
	 *         found
	 */
	public Person find(String name) {
		PersonNode node = head;
		while (node != null) {
			if (node.getData().getName().equals(name)) { // iterating through the whole list until there is a node that
															// matches the string
				break;
			}
			node = node.getNext();
		}
		if (node == null) {
			return null;
		} else {
			return node.getData();// return the person with that string
		}

	}

	/**
	 * toString method which prints the linkedlist
	 */
	public String toString() {
		PersonNode node = head;
		String returnedString = "";
		while (node != null) { // iterates through the linked list and prints each string found in the Person
								// of each node
			returnedString = returnedString + "[" + node.getData().getName() + "]";
			node = node.getNext();
		}
		return returnedString;
	}

}