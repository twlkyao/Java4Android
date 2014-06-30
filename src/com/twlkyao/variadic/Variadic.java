package com.twlkyao.variadic;
public class Variadic {
	
	/**
	 * a method using variadic parameters.
	 * @param s the first parameter.
	 * @param ss the variadic parameter array,
	 * a method can at most has one variadic parameter,
	 * and it must be the last parameter.
	 */
	public static void m1(String s, String... ss) {
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }

    public static void main(String[] args) {

        m1(""); // Because the ss.length is zero.
        m1("aaa"); // Because the ss.length is zero.
        m1("aaa", "bbb", "ccc"); // s = "aaa" ss[] = {"bbb", "ccc"}
    }
}
