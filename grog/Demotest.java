package com.grog;

import java.sql.SQLException;
import java.util.Scanner;

public class Demotest {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<=10;i++) {
			System.out.println(" Enter the Question");
			String Question = sc.next();
			//System.out.println("Question");
			String Option1 = sc.next();
			System.out.println("Option1");
			String Option2 = sc.next();
			System.out.println("Option2");
			String Option3 = sc.next();
			System.out.println("Option3");
			String Option4 = sc.next();
			System.out.println("Option4");
			String  Answer = sc.next();
			System.out.println("Answer");
			
			
			UserInput user = new UserInput();
			user.insertvalue(Question, Option1, Option2, Option3,Option4, Answer);
			
		}
		sc.close();


}

}
