package main_package;
import java.util.Date;
public class Person {
	private String name;
	private String nidNo;
	private String phoneNo;
	private java.util.Date dateCreated;
	public Person(String name, String nidNo, String phoneNo) {
		super();
		this.name = name;
		this.nidNo = nidNo;
		this.phoneNo = phoneNo;
		this.dateCreated = new Date();
	}
	public String getName() {
		return name;
	}
	public String getNidNo() {
		return nidNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", nidNo=" + nidNo + ", phoneNo=" + phoneNo + ", dateCreated=" + dateCreated
				+ "]";
	}
}
