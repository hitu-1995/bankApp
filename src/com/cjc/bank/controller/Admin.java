package com.cjc.bank.controller;

import java.util.Scanner;

import com.cjc.bank.service.RBI;
import com.cjc.bank.service.SBI;

public class Admin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();

		while (flag) {

			System.out.println("1: Create Account : ");
			System.out.println("2: Show Account Details : ");
			System.out.println("3: Show Balance : ");
			System.out.println("4: Deposite Money : ");
			System.out.println("5: Withdraw Money : ");
			System.out.println("6: Update Account : ");
			System.out.println("7: Exit !!");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				rbi.registerAccount();
				break;
			case 2:
				rbi.showAccontDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.depositeMoney();
				break;
			case 5:
				rbi.withdrawMoney();
				break;
			case 6:
				rbi.updateAccount();
				break;
			case 7:
				flag = false;
				break;

			default:
				System.out.println("Wrong Choice !!");
				break;
			}

		}

		sc.close();
		System.out.println("Thank You For Banking !!!");
	}

}
