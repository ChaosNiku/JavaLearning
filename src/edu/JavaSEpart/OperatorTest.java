package edu.JavaSEpart;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		long b=2;
/*		a=a+b is wrong
 * 		a+=b equals a=(int)(a+b)
 */
		a+=b;
		System.out.println("res1 is:"+a+b);
		String s1="d"+"h"+1;
		String	s2="dh1";
//		the content of s3 stored in heap,not in constant pool
		String s3 =new String(s2);
		final String ss1="dh1";
		final String ss2="dh1";
		String s4 ="dh1"+"dh"+"1";
		String s5 =s1+s2;
/*
 * 		ss1&ss2 are modified by the final,the become constant,
 * 		when use + operator,they don't need to create new object (you can see the id)
 * 		so use == operator it return true
 */

		String s6=ss1+ss2;
		
		System.out.println("ex0:"+(s1==s2));
		System.out.println("ex1:"+(s1==s3));
		System.out.println("ex2:"+(s4==(s2+"dh1")));
		System.out.println("ex2.5:"+(s4==s6));
		System.out.println("ex3:"+(s4==s5));
		System.out.println("ex4:"+("dh1"==s3));
	}

}
