package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBConn2 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  try
	  {
		System.out.println("Enter the Producte code");
		String pCode=sc.nextLine();
		System.out.println("Enter the Producte Name");
		String pName=sc.nextLine();
		System.out.println("Enter the Producte Price");
		float pPrice=sc.nextFloat();
		System.out.println("Enter the Producte Quentites");
		int pqty=sc.nextInt();
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","system","abc");
		Statement stm=con.createStatement();
		int k=stm.executeUpdate("insert into Product51 values('"+pCode+"','"+pName+"',"+pPrice+","+pqty+")");
		if(k>0)
		{
			 System.out.println("Producte update successfully...");
		}
		con.close();
		sc.close();
	  }catch(Exception e) {e.printStackTrace();}
	  
	  
}
}
