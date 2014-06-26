package com.twlkyao.base_sub_class;

public class SubClass extends BaseClass {
	String name = "Sub";
	
	public SubClass() {
		printName();
	}
	
	public void printName() {
		System.out.println(name + "——Sub");
	}
	
	public static void main(String[] args) {
		new SubClass(); // 调用父类的构造函数的时候，调用的printName()实际上调用的是子类的printName()，而此时子类的name还没有被初始化，所以输出null.
						// 因为printName()被重写。
	}
}
