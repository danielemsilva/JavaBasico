package classes;

import java.util.Scanner;

public class Menu {

	private static List myList;
	
	private static void register(Scanner sc) {
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Phone: ");
		String phone = sc.nextLine();
		
		try {
			boolean success = myList.newContact(name, phone);
			if (success) {
				System.out.println("Registered\n");
			} else {
				System.out.println("The schedule is full\n");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private static void list() {
		System.out.println();
		for (int i = 0; i < myList.qtContacts(); i++) {
			String contact = myList.getContact(i);
			if (!contact.equals("")) {
				System.out.println(String.valueOf(i) + " - " + contact);
			}
		}
		System.out.println();
	}
	
	private static void showContact(Scanner sc) {
		System.out.println();
		System.out.println("Contact> ");
		int position = Integer.parseInt(sc.nextLine());
		
		String contact = myList.getContact(position-1);
		if (!contact.equals("")) {
			System.out.println(contact + "\n");
		} else {
			System.out.println("There is no contact in this position");
		}
	}

	public static void main(String args[]) {
		myList = new List();
		
		Scanner sc = new Scanner(System.in);
		String option = "";
	
		while (!option.equals("E")) {
			System.out.println("(R)egister Contact\n(L)ist contacts\n" +
				"(S)how a contact\n(E)xit\n\nOption> ");
			option = sc.nextLine();
			
			switch(option) {
				case "R":
					register(sc);
					break;
				case "L":
					list();
					break;
				case "S":
					showContact(sc);
					break;
				case "E":
					break;
				default:
					System.out.println("Invalid option\n");
			}
		}
		sc.close();
	}
	
}
