package com.ques1;

public class Zimpl implements Z{

	@Override
	public void abstract_method_X() {
		// TODO Auto-generated method stub
		System.out.println("Overridden abstract method of X");
	}

	@Override
	public void abstract_method_Y() {
		// TODO Auto-generated method stub
		System.out.println("Overridden abstract method of Y");
	}

	@Override
	public void abstract_method_Z() {
		// TODO Auto-generated method stub
		System.out.println("Overridden abstract method of Z");
	}

	@Override
	public void default_method_X() {
		System.out.println("Default overridden method of X");
	}

}
