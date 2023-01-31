package org.constructor;

public class BankDetailes extends EmpSalary {
	public BankDetailes() {
		System.out.println("default chaild - Bank detailes : ");
	}
public BankDetailes(String name,Long mobNo) {
		System.out.println(name +"   " +mobNo);
	}
	public BankDetailes(int accNo) {
	this("icic0001548");
		System.out.println(accNo);
		
	}
	public BankDetailes(String ifscCode) {
		this("siddhapudur", "CBE");
		System.out.println(ifscCode);
		
	}
	public BankDetailes(String Branch, String city) {
		this("mano", 7502760449L);
		System.out.println(Branch +" "+city);
		
	}
	
	

	public static void main(String[] args) {
		BankDetailes bankDetailes = new BankDetailes();
		BankDetailes bankDetailes2 = new  BankDetailes(1208);

	}
	

}
