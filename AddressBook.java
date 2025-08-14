package org.addressbook;

import java.util.*;

public class AddressBook {

	List<Contact> contacts = new ArrayList<>();
	void addContact(Contact contact) {
		contacts.add(contact); 
	}

	void editContact(String name, Scanner scanner) {
		for (Contact contact : contacts) {
			if (contact.firstName.equalsIgnoreCase(name)) {
				System.out.println("Editing contact: " + contact);
				System.out.print("Enter new city: ");
				contact.city = scanner.nextLine();
				System.out.print("Enter new phone: ");
				contact.phone = scanner.nextLine();
				System.out.print("Enter new email: ");
				contact.email = scanner.nextLine();
				System.out.println("Contact updated successfully!");
				return;
			}
		}
		System.out.println("Contact not found.");
	}
	boolean deleteContact(String name) {
		for (Contact contact : contacts) {
			if(contact.firstName.equalsIgnoreCase(name)) {
				return contacts.remove(contact);
			}
		}
		return false;
	}

	void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No contacts available.");
			return;
		}
		System.out.println("\n--- Address Book Contacts ---");
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
}