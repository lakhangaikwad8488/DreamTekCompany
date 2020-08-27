package main.java.yaksha;


  
import java.util.Scanner;

public class Main {

	public static void main(String[] args)   {
		
		
		Scanner sc=new Scanner(System.in);	
		Associate obj=new Associate();
		
		System.out.println("Enter the associate id:");
		int n=sc.nextInt();
		obj.setAssociateId(n);
		
		System.out.println("Enter the associate name:");
		String nm=sc.next();
		obj.setAssociateName(nm);
		
		System.out.println("Enter the number of days:");
		int d=sc.nextInt();
		obj.trackAssociateStatus(d);
	
	}
}