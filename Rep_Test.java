package com.mine;

import java.sql.SQLException;
import java.util.*;

public class Rep_Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		Rep_Services r= new Rep_Services();
		
		System.out.println("Enter choice");
		int ch=s.nextInt();
		
		switch(ch) {
		case 1: r.insert();
			System.out.println("After insertion:");
			r.fetch();
			break;
			
		case 2: r.update();
			System.out.println("After Updation");
			r.fetch();
			break;
		case 3:r.delete();	
			System.out.println("After deletion :");
			r.fetch();
			break;
		case 4:System.out.println("Available Record are:") ;
			r.fetch();	
				break;
		default:
			System.out.println("Enter correct choice");
		}
	}
}
