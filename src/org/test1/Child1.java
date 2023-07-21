package org.test1;

import org.test.Parent;

public class Child1 extends Parent {

	public void play() {
		System.out.println("Playing");
	}
	
	public void sleep() {
		System.out.println("Sleeping");	
	}
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.sing();
		c.watch();
		c.sleep();
		c.play();
		System.out.println(c.salary);
	}
	
}
