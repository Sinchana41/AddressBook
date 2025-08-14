package org.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("*----Welcome to Address Book----*");
        AddressBook addressBook=new AddressBook();
		System.out.println("Created contact: " + addressBook.contact);
	}
}
