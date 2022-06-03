package com.ques3;
import java.util.Scanner;
public class IPL {

	void homeTeamStadium(Stadium stadium) {
		
		switch(stadium){
		case EDEN_GARDENS_STADIUM : System.out.println("This is the home ground of KKR");
		break;
		case WANKHEDE_STADIUM : System.out.println("This is the home ground of Mumbai Indians");
		break;
		case CHIDAMBARAM_STADIUM : System.out.println("This is the home ground of CSK");
		break;
		case M_CHINNASWAMY_STADIUM : System.out.println("This is the home ground of RCB");
		break;
		}
	
	}
	
	public static void main(String[] args) {
		IPL ipl = new IPL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stadium name");
		String stadium = sc.next();
		
		//to convert string to enum type, we are using valueOf(), so that we can pass it into the function as the function is taking parameter as enum type.
		Stadium s = Stadium.valueOf(stadium);
		ipl.homeTeamStadium(s);
	}
}
