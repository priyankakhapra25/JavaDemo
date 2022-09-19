package com.mine;
import java.sql.*;
import java.util.Scanner;

public class Rep_Services  implements Repository {
	void co() throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	PreparedStatement p;
	}
	String ins="insert into demo values (?,?,?)";
	String upd= "update demo set dept=? where id=?";
	String del= "delete from demo where id=?";	
	String fetch1= "select * from demo";
	Statement s;
	int id; String name, dept;
	Scanner sc= new Scanner(System.in);
	public void insert() throws ClassNotFoundException, SQLException {
		co();
     	System.out.println("Enter id");
	    id=sc.nextInt();
	    System.out.println("Enter name");
	    name=sc.next();
	    System.out.println("Enter dept");
	    dept=sc.next();
			
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pri", "root", "Pri@1234");
		PreparedStatement p= con.prepareStatement(ins);
		p.setInt(1,id);
		p.setString(2, name);
		p.setString(3,dept);
		p.executeUpdate();
		System.out.println("Done");
	}
	public void update() throws SQLException {
		System.out.println("Enter id");
	    id=sc.nextInt();
	    System.out.println("Enter dept");
	    dept=sc.next();
			
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pri", "root", "Pri@1234");
		PreparedStatement p= con.prepareStatement(upd);
		p.setString(1,dept);
		p.setInt(2,id);
		p.executeUpdate();
		System.out.println("Update Done");
		}

	public void delete() throws SQLException {
		System.out.println("Enter id");
		id=sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pri", "root", "Pri@1234");
		PreparedStatement p= con.prepareStatement(del);
		p.setInt(1, id);
		p.executeUpdate();
		System.out.println("deletion Done");
	}

	public void fetch() throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pri", "root", "Pri@1234");
	    s= con.createStatement();
	    ResultSet rs=s.executeQuery(fetch1);
	    while(rs.next())
	    {
	    System.out.println(rs.getInt(1)+"	"+rs.getString(2)+ "	"+ rs.getString(3));
	    }
		System.out.println("Done");
	    
	    
	    
	}	
		
		
	}
