package com.grog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInput {

	PreparedStatement prs = null;
	Connection con = null;
	
	public void insertvalue(String Question, String Option1, String Option2, String Option3, String Option4, String Answer) {
		
		try {
			ConnectionTest connectiontest = new ConnectionTest();
			Connection connection3 = connectiontest.getConnection();
			prs = connection3.prepareStatement("insert into test(Question, Option1, Option2, Option3, Option4, Answer) values(?,?,?,?,?,?)");
			prs.setString(1,Question);
			prs.setString(2,Option1);
			prs.setString(3,Option2);
			prs.setString(4,Option3);
			prs.setString(5,Option4);
			prs.setString(6,Answer);
			int i = prs.executeUpdate();
			System.out.println(" Insertion is updated" +i);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		

}
