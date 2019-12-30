package pa03;

import java.util.ArrayList;

/***
 * This class allows a user to be able to edit a hash table as they will be able
 * to insert, delete, and search data through the Division Method.
 * 
 * @author -James Nguyen
 *
 */
public class DivHashTableEditor {
	/***
	 * Method which inserts a person into the inputed hash table through the
	 * Division Method
	 * 
	 * @param table
	 *            - the inputed hash table
	 * @param person
	 *            - the person that will be inserted into the hash table
	 */
	public void chainedHashInsert(ArrayList<PersonLinkedList> table, Person person) {
		int index = person.nameToInt() % table.size();
		// uses the divion method by using the modulo operation onto the ascii code
		// total of the person by the size of the table, giving the index of the linked
		// list of the person
		table.get(index).insert(person); // inserting the node into the linked list at the index
	}

	/***
	 * Method which deletes a person from the hash table
	 * 
	 * @param table
	 *            - the inputed hash table
	 * @param person
	 *            - the person that will be deleted
	 */
	public void chainedHashDelete(ArrayList<PersonLinkedList> table, Person person) {
		int index = person.nameToInt() % table.size();
		// uses the divion method by using the modulo operation onto the ascii code
		// total of the person by the size of the table, giving the index of the linked
		// list of the person
		table.get(index).delete(person); // deleting the node from the linked list at the index

	}

	/***
	 * Method which will search for a specific person in the list and return the
	 * actual person object in the position
	 * 
	 * @param table
	 *            - the inputed hash table
	 * @param person
	 *            - the person that is going to be searched for
	 * @return - the actual person object in the hash table
	 */
	public Person chainedHashSearch(ArrayList<PersonLinkedList> table, Person person) {
		int index = person.nameToInt() % table.size();
		// uses the divion method by using the modulo operation onto the ascii code
		// total of the person by the size of the table, giving the index of the linked
		// list of the person
		Person returnedPerson = table.get(index).find(person.getName()); // finds the actual person within the linked list at
																			// the index
		return returnedPerson;
	}

}
