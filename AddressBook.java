package org.addressbook;

import java.util.*;

public class AddressBook {

	List<Contact> contacts = new ArrayList<>();
	void addContact(Contact c) {
		contacts.add(c); 
	}
}
