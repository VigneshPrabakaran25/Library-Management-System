package library;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Admin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Admin1");
		ll.add("pass");
		System.out.println("Enter the UserName");
	    String str1=sc.nextLine();
	    System.out.println("Enter the Password");
		String str2=sc.nextLine();
		if(ll.contains(str1)&&ll.contains(str2));
		System.out.println("Login SuccessFully");
		System.out.println("Add  Librarians");
		TreeMap<Integer,String> ll1=new TreeMap<Integer,String>();
		System.out.print("Librarian Id");
		int libId=sc.nextInt();
		
		System.out.print("Enter Librarian Name");
		String LibName=sc.next();
		ll1.put(libId,LibName);
		
		System.out.println("Librarians Details");
		
			System.out.println(ll1);
		
		System.out.println("Update Details");
		System.out.println("Enter The Book_Idss:");
		int id=sc.nextInt();
		System.out.println("Enter The Name");
		String cname=sc.next();
		ll1.put(id, cname);
		System.out.println("After Updating Details");
		
			System.out.println(ll1);
		
		System.out.println("Delete Details");
		System.out.println("Enter Librarians Name");
		String removename=sc.next();
		
		System.out.println("After Deletion Details");
		ll1.clear();
			System.out.println(ll1);
		
		System.out.println("If You Logout Type:logout");
		String str3=sc.next();
		String str4="logout";
		if(str3.equals(str4)){
			System.out.println("LogOut Successfully");
		}
		
	}
}
	


