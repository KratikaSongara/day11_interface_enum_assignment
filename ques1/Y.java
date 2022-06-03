package com.ques1;

public interface Y {
	
	void abstract_method_Y(); //by default, it is public & abstract
	
	default void default_method_Y() {
		System.out.println("Default method of Y");
	}
	
	static void static_method_Y() {
		System.out.println("Static method of Y");
	}
	
}
