package org.yewon.child;

import org.yewon.impl.IdeaImpl;
import org.yewon.parent.Animal;

public class Human extends Animal implements IdeaImpl{

	public void speak() {
		System.out.println("STATUS: Aniaml.Human.speak()");
	}
	
	@Override
	public void move() {
		System.out.println("Animal is moving");
	}

	@Override
	public void toIdea() {
		System.out.println("Human.toIdea()");
	}
}
