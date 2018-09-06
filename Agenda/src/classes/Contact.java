package classes;

public class Contact {

	private String name, phone;
	
	public Contact(String name, String phone) {
		if (name == null || name.trim().equals("")) {
			throw new NullPointerException("Invalid entry for name");
		}
		if (phone == null || phone.trim().equals("")) {
			throw new NullPointerException("Invalid entry for phone");
		}	
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.phone;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Contact other = (Contact) obj;
		if (name == null && other.name != null) {
			return false;
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phone == null && other.phone != null) {
			return false;
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	
}
