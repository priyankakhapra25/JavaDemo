package com.demo.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class Demo  {
		public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException
		{
			File f= new File("D:\\javaprog\\cal");
			FileInputStream f1= new FileInputStream(f);	
			System.out.println("File found");		
		
			Class.forName("");
			Connection c= DriverManager.getConnection("");
	
		}
}
