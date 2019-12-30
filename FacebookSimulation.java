package pa03;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/***
 * This class allows the User to create a Facebook Simulation in which users are
 * to have many different choices as they able to create Facebook accounts,
 * choose other accounts to add or defriend each other,search for other accounts
 * and find information about the different accounts in the system
 * 
 * @author - James Nguyen
 *
 */
public class FacebookSimulation extends JFrame implements ActionListener {
	public MultHashTableEditor multEditor;// hashtable editor for multiplication method
	public DivHashTableEditor divEditor; // hashtable editor for division method
	public ArrayList<PersonLinkedList> multTable; // hash table for multiplcation method
	public ArrayList<PersonLinkedList> divTable; // hash table for division method

	/***
	 * Constructor which initializes the hash tables for the multiplication method
	 * and division method, as well as create a window in which users are able to
	 * choose many different choices such as creating or deleting accounts,
	 * friending or defriending accounts, and searching for accounts
	 */
	public FacebookSimulation() {
		super("Facebook Simulation");
		this.setSize(825, 500);
		this.setLayout(new GridLayout(7, 2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// initializing the has hash tables, and hash table editors
		multEditor = new MultHashTableEditor();
		divEditor = new DivHashTableEditor();
		multTable = new ArrayList<PersonLinkedList>();
		divTable = new ArrayList<PersonLinkedList>();

		for (int i = 1; i <= 11; i++) { // adding 11 linked lists into the the hash tables for chaining when collisions
										// occur
			PersonLinkedList multList = new PersonLinkedList();
			PersonLinkedList divList = new PersonLinkedList();
			multTable.add(multList);
			divTable.add(divList);
		}
		//inserting the top 50 distinct names
		multEditor.chainedHashInsert(multTable, new Person("Liam"));
		multEditor.chainedHashInsert(multTable, new Person("Noah"));
		multEditor.chainedHashInsert(multTable, new Person("William"));
		multEditor.chainedHashInsert(multTable, new Person("James"));
		multEditor.chainedHashInsert(multTable, new Person("Logan"));
		multEditor.chainedHashInsert(multTable, new Person("Benjamin"));
		multEditor.chainedHashInsert(multTable, new Person("Mason"));
		multEditor.chainedHashInsert(multTable, new Person("Elijah"));
		multEditor.chainedHashInsert(multTable, new Person("Oliver"));
		multEditor.chainedHashInsert(multTable, new Person("Jacob"));
		multEditor.chainedHashInsert(multTable, new Person("Lucas"));
		multEditor.chainedHashInsert(multTable, new Person("Michael"));
		multEditor.chainedHashInsert(multTable, new Person("Alexander"));
		multEditor.chainedHashInsert(multTable, new Person("Ethan"));
		multEditor.chainedHashInsert(multTable, new Person("Daniel"));
		multEditor.chainedHashInsert(multTable, new Person("Matthew"));
		multEditor.chainedHashInsert(multTable, new Person("Aiden"));
		multEditor.chainedHashInsert(multTable, new Person("Henry"));
		multEditor.chainedHashInsert(multTable, new Person("Joseph"));
		multEditor.chainedHashInsert(multTable, new Person("Jackson"));
		multEditor.chainedHashInsert(multTable, new Person("Samuel"));
		multEditor.chainedHashInsert(multTable, new Person("Sebastian"));
		multEditor.chainedHashInsert(multTable, new Person("David"));
		multEditor.chainedHashInsert(multTable, new Person("Carter"));
		multEditor.chainedHashInsert(multTable, new Person("Wyatt"));
		multEditor.chainedHashInsert(multTable, new Person("Emma"));
		multEditor.chainedHashInsert(multTable, new Person("Olivia"));
		multEditor.chainedHashInsert(multTable, new Person("Ava"));
		multEditor.chainedHashInsert(multTable, new Person("Isabella"));
		multEditor.chainedHashInsert(multTable, new Person("Sophia"));
		multEditor.chainedHashInsert(multTable, new Person("Mia"));
		multEditor.chainedHashInsert(multTable, new Person("Charlotte"));
		multEditor.chainedHashInsert(multTable, new Person("Amelia"));
		multEditor.chainedHashInsert(multTable, new Person("Evelyn"));
		multEditor.chainedHashInsert(multTable, new Person("Abigail"));
		multEditor.chainedHashInsert(multTable, new Person("Harper"));
		multEditor.chainedHashInsert(multTable, new Person("Emily"));
		multEditor.chainedHashInsert(multTable, new Person("Elizabeth"));
		multEditor.chainedHashInsert(multTable, new Person("Avery"));
		multEditor.chainedHashInsert(multTable, new Person("Sofia"));
		multEditor.chainedHashInsert(multTable, new Person("Ella"));
		multEditor.chainedHashInsert(multTable, new Person("Madison"));
		multEditor.chainedHashInsert(multTable, new Person("Scarlett"));
		multEditor.chainedHashInsert(multTable, new Person("Victoria"));
		multEditor.chainedHashInsert(multTable, new Person("Aria"));
		multEditor.chainedHashInsert(multTable, new Person("Grace"));
		multEditor.chainedHashInsert(multTable, new Person("Chloe"));
		multEditor.chainedHashInsert(multTable, new Person("Camila"));
		multEditor.chainedHashInsert(multTable, new Person("Penelope"));
		multEditor.chainedHashInsert(multTable, new Person("Riley"));
		
		//inserting the top 50 distinct names
		divEditor.chainedHashInsert(divTable, new Person("Liam"));
		divEditor.chainedHashInsert(divTable, new Person("Noah"));
		divEditor.chainedHashInsert(divTable, new Person("William"));
		divEditor.chainedHashInsert(divTable, new Person("James"));
		divEditor.chainedHashInsert(divTable, new Person("Logan"));
		divEditor.chainedHashInsert(divTable, new Person("Benjamin"));
		divEditor.chainedHashInsert(divTable, new Person("Mason"));
		divEditor.chainedHashInsert(divTable, new Person("Elijah"));
		divEditor.chainedHashInsert(divTable, new Person("Oliver"));
		divEditor.chainedHashInsert(divTable, new Person("Jacob"));
		divEditor.chainedHashInsert(divTable, new Person("Lucas"));
		divEditor.chainedHashInsert(divTable, new Person("Michael"));
		divEditor.chainedHashInsert(divTable, new Person("Alexander"));
		divEditor.chainedHashInsert(divTable, new Person("Ethan"));
		divEditor.chainedHashInsert(divTable, new Person("Daniel"));
		divEditor.chainedHashInsert(divTable, new Person("Matthew"));
		divEditor.chainedHashInsert(divTable, new Person("Aiden"));
		divEditor.chainedHashInsert(divTable, new Person("Henry"));
		divEditor.chainedHashInsert(divTable, new Person("Joseph"));
		divEditor.chainedHashInsert(divTable, new Person("Jackson"));
		divEditor.chainedHashInsert(divTable, new Person("Samuel"));
		divEditor.chainedHashInsert(divTable, new Person("Sebastian"));
		divEditor.chainedHashInsert(divTable, new Person("David"));
		divEditor.chainedHashInsert(divTable, new Person("Carter"));
		divEditor.chainedHashInsert(divTable, new Person("Wyatt"));
		divEditor.chainedHashInsert(divTable, new Person("Emma"));
		divEditor.chainedHashInsert(divTable, new Person("Olivia"));
		divEditor.chainedHashInsert(divTable, new Person("Ava"));
		divEditor.chainedHashInsert(divTable, new Person("Isabella"));
		divEditor.chainedHashInsert(divTable, new Person("Sophia"));
		divEditor.chainedHashInsert(divTable, new Person("Mia"));
		divEditor.chainedHashInsert(divTable, new Person("Charlotte"));
		divEditor.chainedHashInsert(divTable, new Person("Amelia"));
		divEditor.chainedHashInsert(divTable, new Person("Evelyn"));
		divEditor.chainedHashInsert(divTable, new Person("Abigail"));
		divEditor.chainedHashInsert(divTable, new Person("Harper"));
		divEditor.chainedHashInsert(divTable, new Person("Emily"));
		divEditor.chainedHashInsert(divTable, new Person("Elizabeth"));
		divEditor.chainedHashInsert(divTable, new Person("Avery"));
		divEditor.chainedHashInsert(divTable, new Person("Sofia"));
		divEditor.chainedHashInsert(divTable, new Person("Ella"));
		divEditor.chainedHashInsert(divTable, new Person("Madison"));
		divEditor.chainedHashInsert(divTable, new Person("Scarlett"));
		divEditor.chainedHashInsert(divTable, new Person("Victoria"));
		divEditor.chainedHashInsert(divTable, new Person("Aria"));
		divEditor.chainedHashInsert(divTable, new Person("Grace"));
		divEditor.chainedHashInsert(divTable, new Person("Chloe"));
		divEditor.chainedHashInsert(divTable, new Person("Camila"));
		divEditor.chainedHashInsert(divTable, new Person("Penelope"));
		divEditor.chainedHashInsert(divTable, new Person("Riley"));
		
		for (int i = 0; i < multTable.size(); i++) {
			System.out.println(i + " " + multTable.get(i));
			
		}
		System.out.println();
		for (int i = 0; i < divTable.size(); i++) {
			System.out.println(i + " " + divTable.get(i));
		}

		// creating buttons that users are able to push on the interface
		Button divCreate = new Button("Create an account for the Social Media");
		Button multCreate = new Button("Create an account for the Social Media");
		Button divAdd = new Button("Choose a created account and add another created account as a friend");
		Button multAdd = new Button("Choose a created account and add another created account as a friend");
		Button divDef = new Button("Choose a created account and defriend another created account");
		Button multDef = new Button("Choose a created account and defriend another created account");
		Button divSearch = new Button("Search for a user and show their friends list");
		Button multSearch = new Button("Search for a user and show their friends list");
		Button divCheck = new Button("Check whether two users are friends");
		Button multCheck = new Button("Check whether two users are friends");
		Button divDeac = new Button("Deactivate and delete a created account");
		Button multDeac = new Button("Deactivate and delete a created account");

		// giving the buttons action listeners so the an action will occur when the
		// buttons are pushed
		divCreate.addActionListener(this);
		multCreate.addActionListener(this);
		divAdd.addActionListener(this);
		multAdd.addActionListener(this);
		divDef.addActionListener(this);
		multDef.addActionListener(this);
		divSearch.addActionListener(this);
		multSearch.addActionListener(this);
		divCheck.addActionListener(this);
		multCheck.addActionListener(this);
		divDeac.addActionListener(this);
		multDeac.addActionListener(this);

		// setting up commands for each button as each button will give out a different
		// command when presssed
		divCreate.setActionCommand("divCreate");
		multCreate.setActionCommand("multCreate");
		divAdd.setActionCommand("divAdd");
		multAdd.setActionCommand("multAdd");
		divDef.setActionCommand("divDef");
		multDef.setActionCommand("multDef");
		divSearch.setActionCommand("divSearch");
		multSearch.setActionCommand("multSearch");
		divCheck.setActionCommand("divCheck");
		multCheck.setActionCommand("multCheck");
		divDeac.setActionCommand("divDeac");
		multDeac.setActionCommand("multDeac");

		// adding labels and buttons into the window
		this.add(new JLabel("Division Hash Table", JLabel.CENTER));
		this.add(new JLabel("Multiplication Hash Table (Seperate from Division Hash Table)", JLabel.CENTER));
		this.add(divCreate);
		this.add(multCreate);
		this.add(divAdd);
		this.add(multAdd);
		this.add(divDef);
		this.add(multDef);
		this.add(divSearch);
		this.add(multSearch);
		this.add(divCheck);
		this.add(multCheck);
		this.add(divDeac);
		this.add(multDeac);

		this.setVisible(true);
	}

	/***
	 * method which will create a window that displays the different accounts within
	 * the inputed table
	 * 
	 * @param table
	 *            - the inputed table
	 * @return - the window that will display the different accounts
	 */
	public JFrame showAccountWindow(ArrayList<PersonLinkedList> table) {
		JFrame accountPage = new JFrame();

		int numofAcc = getNumofAcc(table); // getting the number of accounts from the table
		accountPage.setSize(500, 200 + (numofAcc) * 10);// setting the size of the window based on the number of
														// accounts in the table
		accountPage.setLayout(new GridLayout(numofAcc + 1, 1));
		accountPage.add(new JLabel("Here are the list of accounts that are created.", JLabel.CENTER));
		for (int i = 0; i < table.size(); i++) {
			ArrayList<Person> linkedList = table.get(i).linkedToArray(); // turns the linked list into an array
			for (int j = 0; j < linkedList.size(); j++) { // iterates through the array and prints each account out
				accountPage.add(new Label(linkedList.get(j).getName()));
			}
		}
		accountPage.setVisible(true);
		return accountPage; // returning the window that wil display the different accounts

	}

	/***
	 * method which will return the number of accounts within the inputed hash table
	 * 
	 * @param table
	 *            - the inputed hash table
	 * @return - the number of accounts within that hash table
	 */
	public int getNumofAcc(ArrayList<PersonLinkedList> table) {
		int numOfAcc = 0;
		for (int i = 0; i < table.size(); i++) {
			ArrayList<Person> linkedList = table.get(i).linkedToArray(); // turning the linked list within each index to
																			// an array and adding up the number of
																			// accounts
			for (int j = 0; j < linkedList.size(); j++) {
				numOfAcc++;
			}
		}
		return numOfAcc;
	}

	/**
	 * method which will listen and perform the event if one of the buttons send an
	 * action command
	 */
	@Override
	public void actionPerformed(ActionEvent pushed) {
		String event = pushed.getActionCommand(); // get the event that is sent when one of the buttons are pushed
		// if the user clicks on the create account of the division method button
		if (event.equals("divCreate")) {
			String name = JOptionPane.showInputDialog(
					"What is the name of the account you would like to create? (Case & Space Sensitive)");
			// ask the user to enter a name that they would like the new account to be
			if (name == null) { // if the user presses cancel
				// do nothing
			} else if (name.equals("")) { // if the name is an empty string
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1)); // creates a window that tells the user the name field is empty
				fail.add(new JLabel("The name field is empty. Try again.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				Person person = new Person(name);
				divEditor.chainedHashInsert(divTable, person); // the person object is created and added to the table
				JFrame success = new JFrame("Success"); // creates a success window that tells the user that the account
														// has been created
				success.setSize(500, 250);
				success.setLayout(new GridLayout(1, 1));
				success.add(new JLabel("Success the account with the name, " + name + ", has been created.",
						JLabel.CENTER));
				success.setVisible(true);
				for (int i = 0; i < divTable.size(); i++) {
					System.out.println(i + " " + divTable.get(i));
				}
			}
		}
		// if the user clicks on the create account of the Multiplication method
		if (event.equals("multCreate")) {
			// asks the user to enter a name that they would like they account to have
			String name = JOptionPane.showInputDialog(
					"What is the name of the account you would like to create? (Case & Space Sensitive)");
			if (name == null) { // if the user presses the cancel button
				// do nothing
			} else if (name.equals("")) { // if the string is an empty string
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150); // a failure window will be created telling the user the field is empty
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("The name field is empty. Try again.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				Person person = new Person(name);
				multEditor.chainedHashInsert(multTable, person); // a person object is created under the inputed name
																	// and added to the table
				JFrame success = new JFrame("Success");
				success.setSize(400, 150);
				success.setLayout(new GridLayout(1, 1)); // creates a success window telling the user the account has
															// been created
				success.add(new JLabel("Success the account with the name, " + name + ", has been created.",
						JLabel.CENTER));
				success.setVisible(true);
				for (int i = 0; i < multTable.size(); i++) {
					System.out.println(i + " " + multTable.get(i));
				}
			}
		}
		// if the friend button is clicked on from the Division Method
		if (event.equals("divAdd")) {
			if (getNumofAcc(divTable) < 2) {
				// if the number of accounts is less than 2, a failure message is given since
				// you cannot friend with only 1 account
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There needs to be at least 2 accounts to friend.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(divTable); // shows users the accounts that are currently in the table
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				// asks the user to enter a name for the first account
				if (name == null) { // if the cancel button is pressed
					window.setVisible(false);
				} else { // asks the user to enter another name to friend
					String friendName = JOptionPane.showInputDialog(
							"Enter the name of another account that the selected account would like to add (Case & Space Sensitive)");
					if (friendName == null) { // if the cancel button is pressed
						window.setVisible(false);
					} else {

						Person account = new Person(name); // creates two person objects with both names
						Person friend = new Person(friendName);
						// then searches for the actual person objects that matches with the the key
						account = divEditor.chainedHashSearch(divTable, account);
						friend = divEditor.chainedHashSearch(divTable, friend);
						// if either account or friend are unable to be found
						if (account == null || friend == null) {
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150); // creates a failure window
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Either one or both of the accounts are unable to be found",
									JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
							// if the account is already friends with each other
						} else if (account.friendsList.find(friend.getName()) == friend) {
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150); // create failure window
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Accounts are already friends with each other", JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else {
							if (account == friend) { // if the account and friend are the same account
								JFrame fail = new JFrame("Failure");
								fail.setSize(400, 150);
								fail.setLayout(new GridLayout(2, 1));// create failure window
								fail.add(new JLabel("An account cannot add itself", JLabel.CENTER));
								fail.setVisible(true);
								window.setVisible(false);
							} else {
								account.addFriend(friend); // otherwise, the accounts are friended and a success window
															// appears
								friend.addFriend(account);
								JFrame success = new JFrame("Success");
								success.setSize(500, 250);
								success.setLayout(new GridLayout(1, 1));
								success.add(new JLabel("The accounts are now friends with each other.", JLabel.CENTER));
								window.setVisible(false);
								success.setVisible(true);
							}
						}
					}
				}
			}
		}
		// if the friend button is clicked on from the Multiplication Method
		if (event.equals("multAdd")) {
			// if the number of accounts is less than 2, a failure message is given since
			// you cannot friend with only 1 account
			if (getNumofAcc(multTable) < 2) {
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There needs to be at least 2 accounts to friend.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(multTable); // shows users the accounts that are currently in the
																// table
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				// asks the user to enter a name for the first account
				if (name == null) {// if the cancel button is pressed
					window.setVisible(false);
				} else {
					String friendName = JOptionPane.showInputDialog( // asks the user to enter the name of the second
																		// account
							"Enter the name of another account that the selected account would like to add (Case & Space Sensitive)");
					if (friendName == null) {
						window.setVisible(false); // if the user presses the cancel button
					} else {
						// creates two person objects with both names
						Person account = new Person(name);
						Person friend = new Person(friendName);
						account = multEditor.chainedHashSearch(multTable, account);
						friend = multEditor.chainedHashSearch(multTable, friend);
						// then searches for the actual person objects that matches with the the key
						if (account == null || friend == null) { // if either accounts are not found
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150);
							fail.setLayout(new GridLayout(2, 1)); // creates failure window
							fail.add(new JLabel("Either one or both of the accounts are unable to be found",
									JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else if (account.friendsList.find(friend.getName()) == friend) { // if the accounts are
																							// already friends with each
																							// other
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150);
							fail.setLayout(new GridLayout(2, 1)); // creates failure window
							fail.add(new JLabel("Accounts are already friends with each other", JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else {
							if (account == friend) { // if both accounts are the same one
								JFrame fail = new JFrame("Failure");
								fail.setSize(400, 150);
								fail.setLayout(new GridLayout(2, 1));
								fail.add(new JLabel("An account cannot add itself", JLabel.CENTER));
								fail.setVisible(true);
								window.setVisible(false);
							} else {
								account.addFriend(friend); // the accounts are then added as friends if it passes the
															// conditions
								friend.addFriend(account);
								JFrame success = new JFrame("Success");
								success.setSize(500, 250);
								success.setLayout(new GridLayout(1, 1));
								success.add(new JLabel("The accounts are now friends with each other.", JLabel.CENTER));
								window.setVisible(false);
								success.setVisible(true);
							}
						}
					}
				}
			}
		}
		// if the defriend button of the Division method is pressed
		if (event.equals("divDef")) {
			// checks if the number of accounts are greater or equal to 2 or a failure
			// window will be shown
			if (getNumofAcc(divTable) < 2) {
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There needs to be at least 2 accounts to defriend.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(divTable);
				// asks user for the first account
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				if (name == null) { // if user presses cancel button
					window.setVisible(false);
				} else {
					// asks user for the second account
					String friendName = JOptionPane.showInputDialog(
							"Enter the name of another account that the selected account would like to defriend (Case & Space Sensitive)");
					if (friendName == null) { // if user presses cancel button
						window.setVisible(false);
					} else {

						Person account = new Person(name); // creates 2 person objects to use to search
						Person friend = new Person(friendName);
						account = divEditor.chainedHashSearch(divTable, account); // find the actual person objects that
																					// are in the table
						friend = divEditor.chainedHashSearch(divTable, friend);
						if (account == null || friend == null) { // if there either one of the person objects are unable
																	// to be found
							JFrame fail = new JFrame("Failure"); // a failure window is show
							fail.setSize(400, 150);
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Either one or both of the accounts are unable to be found",
									JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else if (account.friendsList.find(friend.getName()) != friend) { // if both accounts are
																							// already not friends with
																							// each other
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150);
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Accounts are already not friends with each other", JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else {
							if (account == friend) { // if both account instances point to the same account
								JFrame fail = new JFrame("Failure");
								fail.setSize(400, 150);
								fail.setLayout(new GridLayout(2, 1));
								fail.add(new JLabel("An account cannot defriend itself", JLabel.CENTER));
								fail.setVisible(true);
								window.setVisible(false);
							} else { // if it passes all conditions, the accounts with both defriend itself and a
										// success message will be given
								account.deFriend(friend);
								friend.deFriend(account);
								JFrame success = new JFrame("Success");
								success.setSize(500, 250);
								success.setLayout(new GridLayout(1, 1));
								success.add(new JLabel("The accounts are no longer friends with each other.",
										JLabel.CENTER));
								window.setVisible(false);
								success.setVisible(true);
							}
						}
					}
				}
			}
		}
		// if the defriend button of the multiplication method is pressed
		if (event.equals("multDef")) {
			// checks if the number of accounts are greater or equal to 2 or a failure
			// window will be shown
			if (getNumofAcc(multTable) < 2) {
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There needs to be at least 2 accounts to defriend.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(multTable);
				// asks user for name of first account
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				if (name == null) { // if user presses cancel button
					window.setVisible(false);
				} else { // asks user for the name of the second account
					String friendName = JOptionPane.showInputDialog(
							"Enter the name of another account that the selected account would like to defriend (Case & Space Sensitive)");
					if (friendName == null) { // if the cancel button is pressed
						window.setVisible(false);
					} else {

						Person account = new Person(name); // 2 person objects are created
						Person friend = new Person(friendName);
						account = multEditor.chainedHashSearch(multTable, account); // find the actual person objects
																					// within the table
						friend = multEditor.chainedHashSearch(multTable, friend);
						if (account == null || friend == null) { // if either of the accounts are not able to be found
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150);
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Either one or both of the accounts are unable to be found",
									JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else if (account.friendsList.find(friend.getName()) != friend) { // if both accounts are not
																							// friends with each other
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150);
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Accounts are already not friends with each other", JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else {
							if (account == friend) { // if both account instances point to the same account
								JFrame fail = new JFrame("Failure");
								fail.setSize(400, 150);
								fail.setLayout(new GridLayout(2, 1));
								fail.add(new JLabel("An account cannot defriend itself", JLabel.CENTER));
								fail.setVisible(true);
								window.setVisible(false);
							} else { // if it passes all conditions then both accounts will defriend itself
								account.deFriend(friend);
								friend.deFriend(account);
								JFrame success = new JFrame("Success");
								success.setSize(500, 250);
								success.setLayout(new GridLayout(1, 1));
								success.add(new JLabel("The accounts are no longer friends with each other.",
										JLabel.CENTER));
								window.setVisible(false);
								success.setVisible(true);
							}
						}
					}
				}
			}
		}
		// if the search button of the Division method is pressed
		if (event.equals("divSearch")) {
			if (getNumofAcc(divTable) == 0) { // gives error message if table is empty
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There are no accounts to search.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(divTable);
				// asks user for the name of the account to search
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				if (name == null) {// if the cancel button is pressed
					window.setVisible(false);
				} else {
					window.setVisible(false);
					Person account = new Person(name);
					account = divEditor.chainedHashSearch(divTable, account); // the account is searched
					if (account == null) {// if no account is found
						JFrame fail = new JFrame("Failure");
						fail.setSize(400, 150);
						fail.setLayout(new GridLayout(2, 1));
						fail.add(new JLabel("Account not found. Try again.", JLabel.CENTER));
						fail.setVisible(true);
						window.setVisible(false);
					} else {
						JFrame success = new JFrame("Sucess");// success window is created if account is found
						ArrayList<Person> list = account.friendsList.linkedToArray(); // a window is created to show the
																						// friends of the users
						success.setSize(500, 100 + (list.size() + 1) * 10);
						success.setLayout(new GridLayout(list.size() + 2, 1));
						success.add(new JLabel("The account with the name, " + account.getName()
								+ ", was found. Here is their friends list.", JLabel.CENTER));
						if (list.isEmpty()) {
							success.add(new Label("The User has no friends.")); // if there is no friends, it will say
																				// that the User has no friends
						} else {
							for (int i = 0; i < list.size(); i++) {
								success.add(new Label(list.get(i).getName()));
							}
						}
						success.setVisible(true);
					}
				}
			}
		}
		// if the search button is pressed from the Multiplication Method
		if (event.equals("multSearch")) {
			if (getNumofAcc(multTable) == 0) { // if the table is empty an error message is given since you cannot
												// search from 0 accounts
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There are no accounts to search.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(multTable);
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				// get the name of the account that will be searchedF
				if (name == null) { // if the user presses the cancel button
					window.setVisible(false);

				} else {
					window.setVisible(false);
					Person account = new Person(name); // creates person object
					account = multEditor.chainedHashSearch(multTable, account); // uses the person object to find the
																				// actual person object in the table
					if (account == null) {// if the account is not found
						JFrame fail = new JFrame("Failure");
						fail.setSize(400, 150);
						fail.setLayout(new GridLayout(2, 1));
						fail.add(new JLabel("Account not found. Try again.", JLabel.CENTER));
						fail.setVisible(true);
						window.setVisible(false);
					} else {
						JFrame success = new JFrame("Sucess");// if the account is found, a window will pop up with the
																// accounts friend list
						ArrayList<Person> list = account.friendsList.linkedToArray();
						success.setSize(500, 100 + (list.size() + 1) * 10);
						success.setLayout(new GridLayout(list.size() + 2, 1));
						success.add(new JLabel("The account with the name, " + account.getName()
								+ ", was found. Here is their friends list.", JLabel.CENTER));
						if (list.isEmpty()) {
							success.add(new Label("The User has no friends.")); // if there are no friends, the message
																				// will be put
						} else {
							for (int i = 0; i < list.size(); i++) {
								success.add(new Label(list.get(i).getName()));
							}
						}
						success.setVisible(true);
					}
				}
			}

		}
		// if the check button is clicked on from the division method
		if (event.equals("divCheck")) {
			if (getNumofAcc(divTable) < 2) {// checks if there are at least 2 accounts in the table; otherwise a failure
											// message is given
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There are need to be at least 2 account to check.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(divTable);
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				// asks for the first account
				if (name == null) {
					window.setVisible(false);
				} else {
					String friendName = JOptionPane.showInputDialog(
							"Enter the name of another account that you would like to check whether both accounts are friends(Case & Space Sensitive)");
					// asks the user to input the name of the second account
					if (friendName == null) {
						window.setVisible(false);
					} else {
						Person account = new Person(name); // both accounts are then searched
						account = divEditor.chainedHashSearch(divTable, account);
						Person friend = new Person(friendName);
						friend = divEditor.chainedHashSearch(divTable, friend);
						if (account == null || friend == null) { // if one of the accounts are not found, a failure
																	// message is given
							JFrame fail = new JFrame("Failure");
							fail.setSize(400, 150);
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Either one or both accounts were not found. Try again.",
									JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else {
							if (account == friend) { // if both account instances point to the same account an error
														// message is given
								JFrame fail = new JFrame("Failure");
								fail.setSize(500, 150);
								fail.setLayout(new GridLayout(2, 1));
								fail.add(new JLabel(
										"Error. You cannot check if the same account is friends with each other.",
										JLabel.CENTER));
								fail.setVisible(true);
								window.setVisible(false);
							} else {
								JFrame success = new JFrame("Results"); // if both accounts are found a window will pop
																		// up telling whether both accounts are friends
																		// with each other
								success.setLayout(new GridLayout(2, 1));
								success.setSize(500, 150);
								if (account.friendsList.find(friendName) == null) {
									success.add(new JLabel(
											name + " and " + friendName + " are not friends with each other.",
											JLabel.CENTER));
								} else {
									success.add(
											new JLabel(name + " and " + friendName + " are friends with each other.",
													JLabel.CENTER));
								}
								success.setVisible(true);
								window.setVisible(false);
							}
						}
					}
				}
			}
		}
		// if the check button of the Multiplication Method is pressed
		if (event.equals("multCheck")) {
			if (getNumofAcc(multTable) < 2) { // an error message is given if the table is not at least 2
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There are need to be at least 2 account to check.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(multTable);
				String name = JOptionPane.showInputDialog("Enter the name of an account (Case & Space Sensitive)");
				// ask the user to enter the first account
				if (name == null) { // if the user presses the cancel button
					window.setVisible(false);
				} else {
					String friendName = JOptionPane.showInputDialog(
							"Enter the name of another account that you would like to check whether both accounts are friends(Case & Space Sensitive)");
					// ask the user to enter the second account
					if (friendName == null) {// if the user presses the cancel button
						window.setVisible(false);
					} else {
						Person account = new Person(name);// searches for both accounts using person objects
						account = multEditor.chainedHashSearch(multTable, account);
						Person friend = new Person(friendName);
						friend = multEditor.chainedHashSearch(multTable, friend);
						if (account == null || friend == null) { // if one of the accounts are not found
							JFrame fail = new JFrame("Failure"); // failure message given
							fail.setSize(500, 150);
							fail.setLayout(new GridLayout(2, 1));
							fail.add(new JLabel("Either one or both accounts were not found. Try again.",
									JLabel.CENTER));
							fail.setVisible(true);
							window.setVisible(false);
						} else {
							if (account == friend) { // if both account instances point to the same account, an error
														// message is passed
								JFrame fail = new JFrame("Failure");
								fail.setSize(500, 150);
								fail.setLayout(new GridLayout(2, 1));
								fail.add(new JLabel(
										"Error. You cannot check if the same account is friends with each other.",
										JLabel.CENTER));
								fail.setVisible(true);
								window.setVisible(false);
							} else {
								JFrame success = new JFrame("Results");// if the accounts are found, a window will pop
																		// up showing whether both accounts are friends
																		// with each other or not
								success.setLayout(new GridLayout(2, 1));
								success.setSize(400, 150);
								if (account.friendsList.find(friendName) == null) {
									success.add(new JLabel(
											name + " and " + friendName + " are not friends with each other.",
											JLabel.CENTER));
								} else {
									success.add(
											new JLabel(name + " and " + friendName + " are friends with each other.",
													JLabel.CENTER));
								}
								success.setVisible(true);
								window.setVisible(false);
							}
						}
					}
				}
			}
		}
		// if the deactivate button is clicked on by the user of the Division Method
		if (event.equals("divDeac")) {
			if (getNumofAcc(divTable) == 0) { // checks if the table is empty
				JFrame fail = new JFrame("Failure");
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There are no accounts to deactivate.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(divTable);
				String name = JOptionPane.showInputDialog(
						"Enter the name of an account that you would like to deactivate (Case & Space Sensitive)");
				// asks the user for the name of the account they would like to deactivate
				if (name == null) {
					window.setVisible(false); // if the user presses the cancel button
				} else {
					Person account = new Person(name); // the person is then searched for
					account = divEditor.chainedHashSearch(divTable, account);
					if (account == null) { // error message is given if account is not found
						JFrame fail = new JFrame("Failure");
						fail.setSize(400, 150);
						fail.setLayout(new GridLayout(2, 1));
						fail.add(new JLabel("Account not found. Try again.", JLabel.CENTER));
						fail.setVisible(true);
						window.setVisible(false);
					} else {
						divEditor.chainedHashDelete(divTable, account);// the account is then deleted
						for (int i = 0; i < divTable.size(); i++) {
							ArrayList<Person> linkedList = divTable.get(i).linkedToArray();
							for (int j = 0; j < linkedList.size(); j++) { // the lists are then iterated through and
																			// each account that is friended with the
																			// deactivated account will then defriend
																			// the account
								if (linkedList.get(j).friendsList.find(name) != null) {
									linkedList.get(j).friendsList.delete(account);
								}
							}
						}
						JFrame success = new JFrame("Success"); // success window pops up say the account has been
																// deactivated
						success.setLayout(new GridLayout(2, 1));
						success.setSize(550, 150);
						success.add(
								new JLabel("Success. The account with the name, " + name + ", has been deactivated.",
										JLabel.CENTER));
						success.add(new JLabel(
								"All accounts that were friends with the deactivated account has defriended the account.",
								JLabel.CENTER));
						success.setVisible(true);
						window.setVisible(false);
					}
				}
			}
		}
		// if the deactivate button is pressed from the Multiplication Method
		if (event.equals("multDeac")) { // checks if the table is empty
			if (getNumofAcc(multTable) == 0) {
				JFrame fail = new JFrame("Failure"); // a failure message is given
				fail.setSize(400, 150);
				fail.setLayout(new GridLayout(1, 1));
				fail.add(new JLabel("Error. There are no accounts to deactivate.", JLabel.CENTER));
				fail.setVisible(true);
			} else {
				JFrame window = showAccountWindow(multTable);
				// asks user for the name of the account they would like to deactivate
				String name = JOptionPane.showInputDialog(
						"Enter the name of an account that you would like to deactivate (Case & Space Sensitive)");
				if (name == null) { // if the user presses the cancel button
					window.setVisible(false);
				} else {
					Person account = new Person(name); // searches for the person object with the name
					account = multEditor.chainedHashSearch(multTable, account);
					if (account == null) { // if no person is found a failure message is given.
						JFrame fail = new JFrame("Failure");
						fail.setSize(400, 150);
						fail.setLayout(new GridLayout(2, 1));
						fail.add(new JLabel("Account not found. Try again.", JLabel.CENTER));
						fail.setVisible(true);
						window.setVisible(false);
					} else {
						multEditor.chainedHashDelete(multTable, account);// otherwise, the table will delete the account
						for (int i = 0; i < multTable.size(); i++) {
							ArrayList<Person> linkedList = multTable.get(i).linkedToArray();
							for (int j = 0; j < linkedList.size(); j++) {// the table is iterated through each account
																			// and each account will defriend the
																			// deactivated account if they are friends
								if (linkedList.get(j).friendsList.find(name) != null) {
									linkedList.get(j).friendsList.delete(account);
								}
							}
						}
						JFrame success = new JFrame("Success");// success window that pops up when the account has been
																// deactivated
						success.setLayout(new GridLayout(2, 1));
						success.setSize(550, 150);
						success.add(
								new JLabel("Success. The account with the name, " + name + ", has been deactivated.",
										JLabel.CENTER));
						success.add(new JLabel(
								"All accounts that were friends with the deactivated account has defriended the account.",
								JLabel.CENTER));
						success.setVisible(true);
						window.setVisible(false);
					}
				}
			}
		}

	}

	/***
	 * main class which will create the facebook simulation
	 * 
	 * 
	 */
	public static void main(String[] args) {
		FacebookSimulation facebookSimulator = new FacebookSimulation();
	}
}
