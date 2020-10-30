package com.exceptionRuleWhileOverriding;

public class Parent1 {
	/*
	 * 1) Rule: If the superclass method does not declare an exception, subclass
	 * overridden method cannot declare the checked exception.
	 */
	void msg() {
		System.out.println("parent");
	}
}
