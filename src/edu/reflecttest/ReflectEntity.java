package edu.reflecttest;

public class ReflectEntity {
	int filed1;
	double field2;
	public void print(){
		System.out.println("field1:"+filed1);
		System.out.println("field2:"+field2);
	}
	public int getFiled1() {
		return filed1;
	}
	public void setFiled1(int filed1) {
		this.filed1 = filed1;
	}
	public double getField2() {
		return field2;
	}
	public void setField2(double field2) {
		this.field2 = field2;
	}
	public ReflectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
