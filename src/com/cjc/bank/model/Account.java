package com.cjc.bank.model;

public class Account {

	private int acno;
	private String acname;
	private long adharCard;
	private String pancard;
	private long mobNo;
	private double balance;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public long getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(long adharCard) {
		this.adharCard = adharCard;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account No : " + acno + "\nName : " + acname + "\nAdhar Card : " + adharCard 
				+ "\nPan Card : " + pancard
				+ "\nMob No : " + mobNo + "\nBalance : " + balance+"\n\n";
	}

	
}
