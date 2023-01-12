package com.pro.custom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccountHolder extends Bank{

	   long account;
	   String userName;
	   String password;
	public AccountHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountHolder(String branch, int ifsc,long account, String userName, String password) {
		super(branch,ifsc);
		this.account = account;
		this.userName = userName;
		this.password = password;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccountHolder [account=" + account + ", userName=" + userName + ", password=" + password + ", branch="
				+ branch + ", ifsc=" + ifsc + "]";
	}
	private void writeObject(ObjectOutputStream oos) throws IOException {
		
		System.out.println("inside writeobject method!!!");
		//oos.writeUTF(branch);
		oos.writeInt(ifsc);
		System.out.println(account);
		String encodedAcc = Long.toUnsignedString(account, 0)+1234;
		System.out.println(">>>>>>"+encodedAcc);
		oos.writeUTF(userName);
		oos.writeUTF("abc"+password+1111);
		System.out.println("encoded ac & password!!!!!");
		
	}
	private void readObject(ObjectInputStream ois) throws Exception {
//		ois.defaultReadObject();
//		branch =ois.readUTF();
		ifsc = ois.readInt();
		long encodedAccount = ois.readLong();
		account = encodedAccount-1234567890;
		userName = ois.readUTF();
		String encodedPassword = ois.readUTF();
		password = encodedPassword.substring(3,encodedPassword.length()-4);
		System.out.println("decoded ac & password!!!!!");
	}
	   
}
