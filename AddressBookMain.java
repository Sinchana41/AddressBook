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
     
	}
}
