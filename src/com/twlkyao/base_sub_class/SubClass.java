package com.twlkyao.base_sub_class;

public class SubClass extends BaseClass {
	String name = "Sub";
	
	public SubClass() {
		printName();
	}
	
	public void printName() {
		System.out.println(name + "����Sub");
	}
	
	public static void main(String[] args) {
		new SubClass(); // ���ø���Ĺ��캯����ʱ�򣬵��õ�printName()ʵ���ϵ��õ��������printName()������ʱ�����name��û�б���ʼ�����������null.
						// ��ΪprintName()����д��
	}
}
