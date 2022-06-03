package com.ques2;

import java.util.Scanner;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String name, String... model) {
		for(int i=0; i<outdatedModels.length; i++) {
			for(int j=0; j<model.length; j++) {
				if(outdatedModels[i].equals(model[j])) {
					System.out.println(model[j]+"_OUTDATED");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile name");
		String name = sc.next();
		
		System.out.println("Enter model name");
		String model = sc.next();
		
		Mobile mobile = new Mobile();
		mobile.searchOutdatedModel(name,model);
	}

}
