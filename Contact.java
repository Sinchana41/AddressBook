package org.addressbook;

public class Contact {

	public String firstName, lastName, address, city, state, email;
	public String phone;
	public int zip;

	Contact(String fn, String ln, String addr, String city, String state, int zip, String phone, String email) {
		this.firstName = fn;
		this.lastName = ln;
		this.address = addr;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", email=" + email + ", phone=" + phone + ", zip=" + zip + "]";
	}


}
