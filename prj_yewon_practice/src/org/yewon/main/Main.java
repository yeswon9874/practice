package org.yewon.main;

import org.yewon.child.Human;

public class Main {

	public static void main (String[] args) {
		
		Human h = new Human();
		h.setName("임예원");
		System.out.println("내 이름은 " + h.getName());
		h.move();
		h.toIdea();
		
		
	}
	
}
