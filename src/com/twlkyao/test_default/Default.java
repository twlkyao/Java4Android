package com.twlkyao.test_default;

/**
 * switch-case is jump by a jump table, so when there are
 * multiple branch, switch is quicker than if-else,
 * but switch-case can only handle constants, while if
 * can handle more cases.
 * @author Jack
 *
 */
public class Default {
	public static void main(String[] args) {
		int a = 3;
		switch (a) {
		default:
			System.out.println("default");
			break;
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
		}
	}
}
