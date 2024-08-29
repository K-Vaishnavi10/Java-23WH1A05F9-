package practice_programs;

import java.util.*;
class animal{
	void move() {
		System.out.println("Animals live in forest");
	}
}
class cheetah extends animal{
	void move() {
		System.out.println("Cheetah runs fast");
	}
}
public class move {

	public static void main(String[] args) {
		cheetah c1 = new cheetah();
		c1.move();

	}

}
