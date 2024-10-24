package practiceprograms;
import java.util.*;
class Even implements Runnable{
	public int x;
	public Even(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		System.out.println("New thread "+x+" is EVEN and square of "+x+" is "+x*x);
	}
}
class Odd implements Runnable{
	public int x;
	public Odd(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		System.out.println("New thread "+x+" is ODD and cube of "+x+" is "+x*x*x);
	}
}
class A extends Thread{
	public void run() {
		int num = 0;
		Random r = new Random();
		try {
			for(int i=0;i<=5;i++) {
				num = r.nextInt(100);
				System.out.println("Main Thread and Generated number is "+num);
				if(num%2==0) {
					Thread t1 = new Thread(new Even(num));
					t1.start();
				}
				else {
					Thread t2 = new Thread(new Odd(num));
					t2.start();
				}
			}
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class multithread {
	public static void main(String args[]) {
		A obj = new A();
		obj.start();
	}
}
