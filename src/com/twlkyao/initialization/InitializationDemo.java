package com.twlkyao.initialization;

public class InitializationDemo { 
	
	int a = 1;
	
	public static void main(String[] args) {
		new InitializationDemo(); // 1,a,2,3,4,c,5,6,b,7,8
		new InitializationDemo(); // a,2,c,5,6,b,7,8
	}
	
	// Initialization's initializer.
	public InitializationDemo() {
		new M();
	}
	
	// Initialization's instance block.
	{
		System.out.println("(2) InitializationDemo's instance block");
	}
	
	// Initialization's static block.
	static {
		System.out.println("(1) InitializationDemo's static block");
	}
} 

class M extends N{
	
	int b = 2;
	
	// M's initializer.
	M() {
		System.out.println("(8) M's constructor body");
	}
	
	// M's instance block.
	{
		System.out.println("(7) M's instance block");
	}
	
	// M's static block.
	static {
		System.out.println("(4) M's static block");
	}
}

class N {
	
	int c = 3;
	
	// N's initializer.
	N() {
		System.out.println("(6) N's constructor body");
	}
	
	// N's instance block.
	{
		System.out.println("(5) N's instance block");
	}
	
	// N's static block.
	static {
		System.out.println("(3) N's static block");
	}
}