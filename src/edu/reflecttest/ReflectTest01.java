package edu.reflecttest;

import java.util.ArrayList;
import java.util.Arrays;

public class ReflectTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		three way to dynamic load class
		try {
//		c1,c2,c3 are all the type of the ReflectEntity class
		Class c1 = Class.forName("edu.reflecttest.ReflectEntity");
		Class c2 = ReflectEntity.class;
		Class c3 = new ReflectEntity().getClass();
		System.out.println("is one class has one Class object:"+(c1==c2?c2==c3:c1==c3));
		ReflectEntity re1 =(ReflectEntity) c1.newInstance();
		ReflectEntity re2 =(ReflectEntity) c2.newInstance();
		ReflectEntity re3 =(ReflectEntity) c2.newInstance();
		ReflectEntity re4 =(ReflectEntity) c3.newInstance();
		ReflectEntity re5 =(ReflectEntity) c3.newInstance();
		re1.setField2(1);re1.setFiled1(0);
		re2.setField2(0);re2.setFiled1(1);
/*		the code under display if all the objects is equivalent
 * 		the re1 & re2 have different field values
 * 		re2 & re3 are generated by the same type 
 */
		System.out.println("is con1 equals:"+re1.equals(re2));
		System.out.println("is con2 equals:"+re1.equals(re3));
		System.out.println("is con3 equals:"+re2.equals(re3));
		System.out.println("is con4 equals:"+re3.equals(re4));
		System.out.println("is con5 equals:"+re4.equals(re5));
		/*all the results are false 
		 * every instance is a new object 
		 * they don't have the same id
		 */
		Integer[] a =new Integer[10];
		int n=0;
		for(Integer i:a){
			a[n++]=n;
			System.out.println(i);
		}
		ArrayList<Integer> l = (ArrayList<Integer>) Arrays.asList(a);
		l.forEach(s->System.out.println(s));
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
