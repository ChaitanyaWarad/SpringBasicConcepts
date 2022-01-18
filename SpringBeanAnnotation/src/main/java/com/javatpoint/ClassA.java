package com.javatpoint;

public class ClassA {

	private int x;
	private ClassB b;
	
	ClassA(){
		System.out.println(this.getClass().getSimpleName()+"No arg constructor");
	}
	

	public ClassA(int x, ClassB b) {
		super();
		this.x = x;
		this.b = b;
		System.out.println(this.getClass().getSimpleName()+"arg constructor");
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ClassB getB() {
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [x=" + x + ", b=" + b + "]";
	}
	
	

}
