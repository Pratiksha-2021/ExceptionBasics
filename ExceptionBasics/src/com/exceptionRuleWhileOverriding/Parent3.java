package com.exceptionRuleWhileOverriding;

public class Parent3 {
	/*
	 * 1) Rule: If the superclass method declares an exception, subclass
	 * overridden method can declare same, subclass exception or no exception
	 * but cannot declare parent exception.
	 */

	
		void msg() throws ArithmeticException {
			System.out.println("parent");
		}
	}


