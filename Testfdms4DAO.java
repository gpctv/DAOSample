package com.stan.dbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Testfdms4DAO implements IDAO{

	private Connection con;
	private Statement stat=null;
	private ResultSet rs;
	public Testfdms4DAO(Connection con){
		this.con=con;
	}
	
	public List<String> selectAll(){
		List<String> t=new ArrayList<String>();
		try{
		String sql="SELECT * FROM fd.tbfdms4";
		stat=this.con.createStatement();
		rs=stat.executeQuery(sql);
		
		while(rs.next()){
			t.add(rs.getString("ROLE_FDMS4"));
		}
		stat.close();
		rs.close();
		}catch(Exception e){
			System.err.println(e);
			try{
			if(stat !=null){
			   stat.close();
			}
			}catch(Exception e2){
				System.err.println(e2);
			}
		}
		return t;
	}
}
