package com.stan.dbc;

public class TestFactory {
 public static IDAO getInstance(){
	 IDAO dao=new TestProxy();
	 return dao;
 }
}
