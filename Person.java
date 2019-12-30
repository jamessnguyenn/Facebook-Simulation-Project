package pa03;

/***
 * 
 * This class allows one to create a person which contains information
 * like the name, and a friends list in which the people they friend will be
 * added to, and the friends they defriend will be removed from.s
 * 
 * @author - James Nguyen
 * 
 */
public class Person {
	String name; // name of the person
	PersonLinkedList friendsList; // friendList of the person

	/***
	 * Constructor which initiates a person by setting the Name, and initiating the
	 * friendList of the class
	 * 
	 * @param name
	 *            - the name of the person
	 */
	public Person(String name) {
		this.name = name;
		friendsList = new PersonLinkedList(); // initiating the linked list
	}

	/**
	 * getter method which returns the name of the person
	 * 
	 * @return - the name of the person
	 */
	public String getName() {
		return name;
	}

	/***
	 * method which will turn the Person's name into a integer, by adding the ascii
	 * codes of each character as a lower case in the string together.
	 * 
	 * @return - the integer repsentation of the person
	 */
	public int nameToInt() {
		int asciiNum = 0;
		String lowerCaseName = name.toLowerCase();// turning the name into lower case form
		for (int i = 0; i < lowerCaseName.length(); i++) { // for loop which will iterate through each character of the
															// name, and add its ascii code together.
			char charcter = lowerCaseName.charAt(i);
			asciiNum = asciiNum + charcter;
		}
		return asciiNum; // returns the total ascii codes of each character in the string
	}

	/***
	 * void method which lets the class add a friend by adding a person to the the
	 * friends list of the class
	 * 
	 * @param person
	 *            - the person which will become the friend
	 */
	public void addFriend(Person person) {
		friendsList.insert(person);// inserting the person into the friends list
	}

	/***
	 * void method which allows the class to defriend a person by removing them from
	 * friends linked list
	 * 
	 * @param person
	 *            - the person that will be removed from the friends linkedList
	 */
	public void deFriend(Person person) {
		friendsList.delete(person); // removes the friend from the linked list
	}

}
