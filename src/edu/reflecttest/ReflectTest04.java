package edu.reflecttest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> aa =new ArrayList<String>();
			     aa.add("I");
				 aa.add("L");
				 aa.add("O");
				 aa.add("V");
				 aa.add("E");
		ArrayList ll =new ArrayList();
		Class c1= aa.getClass();
		Class c2 = ll.getClass();
		/*
		 * ����ֻ���ڱ���׶Σ�������ֹ�������룬������Զ�ȥ���ͻ�
		 * �ƹ����뷺�;���Ч��
		 * ��ͨ��������÷�����֤
		 */
		System.out.println("no generic:"+(c1==c2));
		try {
			Method m = c2.getMethod("add", Object.class);
			m.invoke(aa, 20);
			System.out.println(aa.size());
			System.out.println(aa);
/*
 * 			aa.forEach(s->System.out.println(s)); 
 * 			���ַ�ʽ����ʱ��Ϊarraylist��Ϊ�洢��ȫ��ΪSting���Ի��׳��쳣
 * 			��ʱ���ƹ����ͼ��
 */
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		--------------------------------------------------------
		ArrayList<String> aL =new ArrayList<String>(){
			{
				add("1");
				add("2");
			}
		};

		Class c3 = aL.getClass();
		System.out.println(c3.getName());
//		c3Ϊ�����ڲ����������
		 }
	}


