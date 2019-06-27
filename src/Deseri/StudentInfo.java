package Deseri;

import java.io.Serializable;
import java.util.Scanner;

public class StudentInfo implements Serializable{
	
	String name;
    int rid;
    String contact;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public  String getContact() {
		return contact;
	}
	public  void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentInfo(String name, int rid,String contact) {
		super();
		this.name = name;
		this.rid = rid;
		this.contact=contact;
	}
	
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		this.rid=sc.nextInt();
		System.out.println("Enter name:");
		this.name=sc.next();
		System.out.println("Enter contact:");
		this.contact=sc.next();
		
	}
	
	
	public void display()
	{
		
		System.out.println("id:"+rid);
		System.out.println("name:"+name);
		System.out.println("contact:"+contact);
		
	}
	
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", rid=" + rid + "]";
	}
	
	
    
    

}



