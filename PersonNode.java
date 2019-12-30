package pa03;

/**
 * This class creates a PersonNode with methods to get the Next of the Node,
 * setting the next, and get the data within the Node
 * 
 *
 */
public class PersonNode {
	private Person person; // the data of the node
	private PersonNode next; // the next pointer of the node

	/**
	 * constructor which intiates the person node by intiating the data of the node
	 * 
	 * @param person
	 */
	PersonNode(Person person) {
		this.person = person; // initiates person
	}

	/***
	 * method which return the node that the next pointer is point towards to
	 * 
	 * @return - the node that the next pointer is pointing towards to
	 */
	PersonNode getNext() {
		return next;
	}

	/***
	 * method which will set the node that the next pointer will point at
	 * 
	 * @param next
	 *            - the node that the next pointer of this node will point at
	 */
	void setNext(PersonNode next) {
		this.next = next;
	}

	/***
	 * method which returns the key of the node
	 * 
	 * @return - the person data of the node
	 */
	Person getData() {
		return person;
	}

}