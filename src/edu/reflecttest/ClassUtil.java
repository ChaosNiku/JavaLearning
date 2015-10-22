package edu.reflecttest;

import java.lang.reflect.Method;
import java.util.*;



 
/**
 * 
 * @author chaos
 * print the class info. include the variable of the class and the methods 
 */
public class ClassUtil {
	public static void printClassInfo(Object ob){
		Class<? extends Object> c =ob.getClass();
//		load the type of the class
		Method[] methods=c.getDeclaredMethods();
		List<Method> me = (List<Method>) Arrays.asList(methods);
		me.forEach(s->{
			System.out.print("Method name");
			Class<?> re =s.getReturnType();
			System.out.print(" "+re.getName()+"  "+s.getName()+"(");
			Class[]  par =s.getParameterTypes();
			for(Class<?> c1:par){
				System.out.print(c1.getName()+" ,");
			}
			System.out.println(")");
		});
	}
}
