package org.addressbook;

import java.util.*;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);
	static Map<String, AddressBook> addressBooks = new HashMap<>();

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n=== Address Book System ===");
			System.out.println("1. Create New Address Book");
			System.out.println("2. Add Contact to Address Book");
			System.out.println("3. Display Contacts of an Address Book");
			System.out.println("4. Display All Address Books");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			int choice =sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1 -> createAddressBook();
			case 2 -> addContactToBook();
			case 3 -> displayContactsOfBook();
			case 4 -> displayAllBooks();
			case 5 -> deleteContactFromBook();
			case 6 -> {
				System.out.println("Exiting...");
				return;
			}
			default -> System.out.println("Invalid choice!");
			}
		}
	}


	static void createAddressBook() {
		System.out.print("Enter unique Address Book name: ");
		String name= sc.nextLine();
		if (addressBooks.containsKey(name)) {
			System.out.println("Address Book already exists!");
		} else {
			addressBooks.put(name, new AddressBook());
			System.out.println("Address Book created.");
		}
	}

	static void addContactToBook() {
		System.out.print("Enter Address Book name: ");
		String name = sc.nextLine();
		AddressBook book = addressBooks.get(name);
		if (book == null) {
			System.out.println("Address Book not found!");
			return;
		}
		System.out.print("Enter First Name: ");
		String fn = sc.nextLine();

		System.out.print("Enter Last Name: ");
		String ln = sc.nextLine();

		System.out.print("Enter Address: ");
		String addr = sc.nextLine();

		System.out.print("Enter City: ");
		String city = sc.nextLine();

		System.out.print("Enter State: ");
		String state = sc.nextLine();

		System.out.print("Enter Zip: ");
		int zip = Integer.parseInt(sc.nextLine());

		System.out.print("Enter Phone: ");
		String phone = sc.nextLine();

		System.out.print("Enter Email: ");
		String email = sc.nextLine();

		book.addContact(new Contact(fn, ln, addr, city, state, zip, phone, email));
		System.out.println("Contact added to '" + name + "'.");
	}

	static void displayContactsOfBook() {
		System.out.print("Enter Address Book name: ");
		String name = sc.nextLine();
		AddressBook book = addressBooks.get(name);
		if (book == null) {
			System.out.println("Address Book not found!");
			return;
		}
		book.displayContacts();
	}

	static void deleteContactFromBook() {
		System.out.print("Enter Address Book name: ");
		String name = sc.nextLine();
		AddressBook book = addressBooks.get(name);
		if (book == null) {
			System.out.println("Address Book not found!");
			return;
		}
		System.out.println("Enter the First name of contact to delete:");
		book.deleteContact(sc.nextLine());

	}
	static void displayAllBooks() {
		if (addressBooks.isEmpty()) {
			System.out.println("No Address Books available.");
			return;
		}
		System.out.println("\n--- Address Books ---");
		for (String name : addressBooks.keySet()) {
			System.out.println("- " + name);
		}
	}
}
