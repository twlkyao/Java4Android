package com.twlkyao.test_this;

class TestThis {
	private int number;
	
	public void set(int number) {
		// without this pointer, the assignment has no effect,
		// the variable will be the default value.
		number=number;
		
		// use this to assign value to number.
		this.number=number;
	}
	public void show() {
		// without ambiguity to use the number property.
		System.out.println("number: " + number);
	}
	
	 public static void main(String[] agrs) {
		
		TestThis testThis = new TestThis();
		testThis.set(123);
		testThis.show();
	}
}