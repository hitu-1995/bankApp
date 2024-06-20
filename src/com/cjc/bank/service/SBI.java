package com.cjc.bank.service;

import java.util.Scanner;

import com.cjc.bank.model.Account;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void registerAccount() {

		System.out.println("Enter Account Number : ");
		ac.setAcno(sc.nextInt());

		System.out.println("Enter Account Name : ");
		String name = sc.next();
		name = name + sc.nextLine();
		ac.setAcname(name);

		System.out.println("Enter  Adhar Card Number   : ");
		ac.setAdharCard(sc.nextLong());

		System.out.println("Enter Pan Card Number: ");
		ac.setPancard(sc.next());

		System.out.println("Enter Account Mob Number  : ");
		ac.setMobNo(sc.nextLong());

		System.out.println("Enter Account Balance : ");
		ac.setBalance(sc.nextDouble());

		System.out.println("Account Registration Successfull !!");

	}

	@Override
	public void showAccontDetails() {

		System.out.println("Enter Account Number  : ");
		int acno = sc.nextInt();

		if (acno == ac.getAcno()&&ac.getAcno()!=0) {
			System.out.println(ac);

		} else {
			System.out.println("No Record Found !!");
		}
	}

	@Override
	public void showAccountBalance() {

		System.out.println("Enter Account number : ");
		int acno = sc.nextInt();
		if (acno == ac.getAcno() && ac.getAcno() != 0)
			System.out.println("Account Balance : " + ac.getBalance());
		else
			System.out.println("Account Not Found !!");
	}

	@Override
	public void withdrawMoney() {

		System.out.println("Enter Account number : ");
		int acno = sc.nextInt();
		if (acno == ac.getAcno() && ac.getAcno() != 0) {
			System.out.println("Enter Amout to be Withdraw");
			double amt = sc.nextDouble();
			if (ac.getBalance() > 500.00 && amt < ac.getBalance()) {
				ac.setBalance(ac.getBalance() - amt);
			} else if (ac.getBalance() < 500) {
				System.out.println("Maintain Sufficient balance in your account");
			} else if (amt > ac.getBalance()) {
				System.out.println("Insufficient Balance");
			}
		}

	}

	@Override
	public void depositeMoney() {

		System.out.println("Enter Acount Number to deposit money ");
		int acno = sc.nextInt();
		if (acno == ac.getAcno()&&ac.getAcno()!=0) {
			System.out.println("Enter Amount to be deposit ");
			  double amt = sc.nextDouble()+ac.getBalance();
			ac.setBalance(amt);
			System.out.println("Updated Account balance is " + ac.getBalance());
		}
		else
			System.out.println("Account Not Found");

	}

	@Override
	public void updateAccount() {
		System.out.println("Enter Acoount Number to Update Account Details ");
		int acno = sc.nextInt();
		if (acno == ac.getAcno() && ac.getAcno()!=0) {
			System.out.println("What you Want to Update  ?");
			System.out.println(ac);
			System.out.println("\n1: Name");
			System.out.println("\n2: Adhar");
			System.out.println("\n3: Pan");
			System.out.println("\n4: Mobile");

			 int key = sc.nextInt();
			 switch (key) {
			case 1:
				    System.out.println("Enter new Name to update account ");
				    ac.setAcname(sc.next());
				    
				break;
			case 2:
			    System.out.println("Enter Adhar Number to update account ");
			    ac.setAdharCard(sc.nextLong());
			    
			break;
			case 3:
			    System.out.println("Enter Pan Number to update account ");
			    ac.setPancard(sc.next());
			    
			break;
			case 4:
			    System.out.println("Enter Mobile no to update account ");
			    ac.setMobNo(sc.nextLong());
			break;

			default :
				 System.out.println("Incorrect Choice !!");
				break;
			}
		}
		else
		System.out.println("Account Not Found");

	}

}
