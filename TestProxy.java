package com.stan.dbc;
 
import java.util.List;

public class TestProxy implements IDAO{
	private TestConnect con;
	private Testfdms4DAO dao;
   public TestProxy(){
	   con=new TestConnect();
	   dao=new Testfdms4DAO(con.getConnection());
   }
   
   public List<String> selectAll(){
	   List<String> a=dao.selectAll();
	   con.closeConnection();
	   return a;
   }
}
