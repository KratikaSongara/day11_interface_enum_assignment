package com.ques1;

public interface X {
	
	void abstract_method_X(); //it is public & abstract by default
	
	default void default_method_X() {
		System.out.println("Default method of X");
	}
	
	public static void static_method_X() {
		System.out.println("Static method of X");
	}
}
