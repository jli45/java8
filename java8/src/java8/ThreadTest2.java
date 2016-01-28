package java8;


class Thread2 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printName();
	}
	
	public void printName()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 thread = new Thread2();
		thread.start(); // printName is executed from the thread2
		thread.printName();  //printName is executed from the main Thread
	}

}
