package library;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Librarian1{
		public static void main(String[] args) {
			char r;
			 int a,c;
			 float price; 
			 String str,b,date,bookno;
			Scanner sc=new Scanner(System.in);
			List al=Collections.synchronizedList(new ArrayList<>());
			System.out.println("WELCOME LIBARAY MANAGEMENT SYSTEM");
			LinkedList<String> ll =new LinkedList<String>();
			ll.add("admin");
			ll.add("pass");
			System.out.println("Enter UserName");
			str=sc.nextLine();
			System.out.println("Enter PassWord");
			String str1=sc.nextLine();

			if(ll.contains(str)&&ll.contains(str1))
			{
			System.out.println("Login SuccessFully");
			}
			do 
			{
			System.out.println("Library Management System");
			System.out.println("Press 1 to add Book");
			System.out.println("Press 2 to issue a book");
			System.out.println("Press 3 to return a book");
			System.out.println("Press 4 to update book detais");
			System.out.println("press 5 to delete book details");
			System.out.println("Press 6 to exit");
			Scanner obj1=new Scanner(System.in);
			System.out.println("Enter any Number ");
			 a=obj1.nextInt();
			
			
			switch(a)
			{
			case 1:
			add(al);
			break;
			case 2:
			iss(al);
			break;
			case 3:
			ret(al);
			break;
			case 4:
			update(al);
			break;
			case 5:
			   delete(al);
			   break;
			case 6:
			 exit();
			break;
			   default:
			    System.out.println("Invalid number");
			    break;

			}
			System.out.println("you want to select next option Y/N");
			r=obj1.next().charAt(0);
			}
			while(r=='y'||r=='Y');}
			
			
		
			


			private static void add(List al)
			{
			Scanner scan=new Scanner(System.in);
			System.out.println("Add  Books");

			System.out.print("Book Id");
			int lid=scan.nextInt();
			al.add(lid);
			System.out.print("Enter Book Name");
			String bname=scan.next();
			al.add(bname);
			System.out.print("Book Type");
			String btype=scan.next();
			al.add(btype);
			System.out.println("Book Details");


			System.out.println(al);

			}
			private static  void iss(List al)
			{
			
			
			Scanner obj3=new Scanner(System.in);
			System.out.println("Book Name");
			
			System.out.println("Book_Id");
			int a = obj3.nextInt();
			if(al.contains(a)){
			System.out.println("issue date");
			String b = obj3.next();
			al.add(b);
			

			System.out.println("Return Book Date");
			String date = obj3.next();
			al.add(date);
			System.out.println("issued book details:"+al);
			}
			else
			   {
				System.out.println("that book is not available");
			   }
			}

			private static void ret(List al)
			{
			System.out.println("Today Returned BookDetails");
			if(al.get(4).equals(java.time.LocalDate.now()))
			{
			System.out.println("Student id,Student name,IssueDate,ReturnDate");
			ArrayList al4=new ArrayList<>();
			al4.addAll(al);
			System.out.println(al4);
			}
			else
			{
			System.out.println("No Book Returned Today");
			}
			}

			private static void update(List al)
			{
			Scanner scan=new Scanner(System.in);
			System.out.println("Update Book Details");
			System.out.println("Enter Book Id");
			int id=scan.nextInt();
			System.out.println("Enter Book Name");
			String cname=scan.next();
			al.set(id, cname);
			System.out.println("After Updating Book Details");
			System.out.println(al);

			}
			private static void delete(List al)
			{
				System.out.println("Before Deleting Details");
			System.out.println(al);
			System.out.println("after Deleting Details");
			al.clear();
			System.out.println(al);
			}
			private static void exit()
			{
				System.out.println("LogOut SuccessFully");
			System.exit(0);
			}

		}

