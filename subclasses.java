package practice_programs;
class animal1{
	void eat() {
		System.out.println("Animals eat");
	}
	void sound() {
		System.out.println("Animals do sound");
	}
}
class lion extends animal1{
	void eat() {
		System.out.println("Lion eat flesh");
	}
	void sound() {
		System.out.println("Lion roar");
	}
}
class tiger extends animal1{
	void eat() {
		System.out.println("tiger eat flesh");
	}
	void sound() {
		System.out.println("tiger roar");
	}
}
class panther extends animal1{
	void eat() {
		System.out.println("panther eat flesh");
	}
	void sound() {
		System.out.println("panther roar");
	}
}
public class subclasses {

	public static void main(String[] args) {
		lion l = new lion();
		l.eat();
		l.sound();
		tiger t = new tiger();
		t.eat();
		t.sound();
		panther p = new panther();
		p.eat();
		p.sound();
	}

}
