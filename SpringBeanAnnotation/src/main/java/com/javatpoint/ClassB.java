package com.javatpoint;

public class ClassB {
	
	private int y;
	
	ClassB(){
		System.out.println(this.getClass().getSimpleName()+" Object is created");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "ClassB [y=" + y + "]";
	}
	
	
	
	

}
