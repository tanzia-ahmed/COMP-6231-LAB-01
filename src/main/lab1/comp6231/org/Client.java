package lab1.comp6231.org;

import java.util.ArrayList;

public class Client {

	public static void main(String args[]) {

		// TODO: create 3 account objects (one checking and two saving accounts): ca, sa1, sa2
		//  ---- DONE

		// Checking Account
		BankAccount ca = null;
		try {
			ca = new CheckingAccount(); //default constructor
			//ca = new CheckingAccount(100.00,10.0); //parameterized constructor
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Savings Account 1
		BankAccount sa1 = null;
		try {
			sa1 = new SavingsAccount(); //default constructor
			// sa1 = new SavingsAccount(60.0,2.0); //parameterized constructor
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Savings Account 2
		BankAccount sa2 = null;
		try {
			sa2 = new SavingsAccount(); //default constructor
			// sa2 = new SavingsAccount(60.0,2.0); //parameterized constructor
		} catch (Exception e) {
			e.printStackTrace();
		}



		//TODO: create a generic list called: accounts
		// ---- DONE
		ArrayList<BankAccount> accounts = new ArrayList<>();

		//TODO: add all the three accounts to the list "accounts"
		// ---- DONE

		accounts.add(ca);
		accounts.add(sa1);
		accounts.add(sa2);

		//TODO: print the information of all the three accounts
		// ---- DONE
		for (int num = 0; num < accounts.size(); num++){
			System.out.println(accounts.get(num));
		}

	}
}
