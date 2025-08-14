package org.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("*----Welcome to Address Book----*");
		Scanner scanner=new Scanner(System.in);

		AddressBook book = new AddressBook();
		book.addContact(new Contact("Sinchana", "A N", "Street 1", "Chikkamanglore", "Karnataka", 12345, "9876543210", "Sinch@mail.com"));
		System.out.println(book.contacts.get(book.contacts.size()-1));
		System.out.println("Contact added successfully!");

		System.out.print("Enter the first name of the contact to edit: ");
		String name = scanner.nextLine();
		book.editContact(name, scanner);

		// Display all contacts after edit
		System.out.println("\nUpdated Contacts:");
		for (Contact c : book.contacts) {
			System.out.println(c);
		}

		System.out.print("Enter the first name of the contact to delete: ");
		String firstName = scanner.nextLine();
		boolean result= book.deleteContact(firstName);
		if(result) {
			System.out.println("Contact removed successfully");
		}else {
			System.out.println("Contact not found");
		}


		System.out.println("=== Add Multiple Contacts to Address Book ===");
		while (true) {
			System.out.print("Enter First Name: ");
			String fn = scanner.nextLine();

			System.out.print("Enter Last Name: ");
			String ln = scanner.nextLine();

			System.out.print("Enter Address: ");
			String addr = scanner.nextLine();

			System.out.print("Enter City: ");
			String city = scanner.nextLine();

			System.out.print("Enter State: ");
			String state = scanner.nextLine();

			System.out.print("Enter Zip: ");
			int zip = Integer.parseInt(scanner.nextLine());

			System.out.print("Enter Phone: ");
			String phone = scanner.nextLine();

			System.out.print("Enter Email: ");
			String email = scanner.nextLine();

			// Add contact to address book
			book.addContact(new Contact(fn, ln, addr, city, state, zip, phone, email));

			System.out.print("Do you want to add another contact? (yes/no): ");
			String choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("no")) {
				break;
			}
		}

		book.displayContacts();

	}
}
