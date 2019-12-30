package pa03;

import java.util.ArrayList;

/***
 * This class allows a user to be able to edit a hash table as they will be able
 * to insert, delete, and search data through the Multiplication Method.
 * 
 * @author -James Nguyen
 *
 */
public class MultHashTableEditor {
	/***
	 * Method which inserts a person into the inputed hash table through the
	 * Multiplication method
	 * 
	 * @param table
	 *            - the inputed hash table
	 * @param person
	 *            - the person that will be inserted into the hash table
	 */
	public void chainedHashInsert(ArrayList<PersonLinkedList> table, Person person) {
		int index = (int) (table.size() * ((person.nameToInt() * (Math.sqrt(5) - 1) / 2) % 1));
		// using the multiplication method by multiplying the ascii total of the
		// person's name with Knuth's suggestion, taking the fractional part, and then
		// multiplying it by the length of the table which gives us the index of the
		// person
		table.get(index).insert(person); // inserts the person into the linked list at the index
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
		int index = (int) (table.size() * ((person.nameToInt() * (Math.sqrt(5) - 1) / 2) % 1));
		// using the multiplication method by multiplying the ascii total of the
		// person's name with Knuth's suggestion, taking the fractional part, and then
		// multiplying it by the length of the table which gives us the index of the
		// person
		table.get(index).delete(person);// deleteing the person from the linked list at that index

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
		int index = (int) (table.size() * ((person.nameToInt() * (Math.sqrt(5) - 1) / 2) % 1));
		// using the multiplication method by multiplying the ascii total of the
		// person's name with Knuth's suggestion, taking the fractional part, and then
		// multiplying it by the length of the table which gives us the index of the
		// person
		Person returnedPerson = table.get(index).find(person.getName()); // finding the person from the linked list
		return returnedPerson; // returns the person that is found
	}

}
