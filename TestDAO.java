package com.stan.dbc;

import java.util.List;

public class TestDAO {
	 public static void main(String args[]){
		List<String> g= TestFactory.getInstance().selectAll();
		for(String t:g){
			System.out.println(t);
		}
	 }
}
