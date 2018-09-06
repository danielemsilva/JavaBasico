package classes;

import java.util.Arrays;

public class List {

	private Contact[] contacts;
	private static int position;
	
	public List() {
		contacts = new Contact[100];
		position = 0;
	}
	
	public boolean newContact(String name, String phone) {
		if (position + 1 > contacts.length) {
			return false;
		} else {
			position++;
			contacts[position] = new Contact(name, phone);
			return true;
		}
	}
	
	public String getContact(int position) {
		if(contacts[position] != null) {
			return contacts[position].toString();
		}
		return "";
	}
	
	public int qtContacts() {
		return contacts.length;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj.getClass() == this.getClass())) {
			return false;
		}
		
		List other = (List) obj;
		return (Arrays.equals(this.contacts, other.contacts));
	}
	
}