package org.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("*----Welcome to Address Book----*");

		AddressBook book = new AddressBook();
		book.addContact(new Contact("Sinchana", "A N", "Street 1", "Chikkamanglore", "Karnataka", 12345, "9876543210", "Sinch@mail.com"));
		System.out.println(book.contacts.get(book.contacts.size()-1));
		System.out.println("Contact added successfully!");

	}
}
