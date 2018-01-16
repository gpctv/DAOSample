package com.stan.dbc;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnect {


	private  Connection con;
	
	public  Connection getConnection(){
		try{
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
		 con=DriverManager.getConnection("jdbc:db2://XXXX:50000/DBCSCA","XXXX","XXXX");
		}catch(Exception e){
			System.err.println(e);
		}
		 
		 return con;
	}
	
	public  void closeConnection(){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			}
		}
	}
}
