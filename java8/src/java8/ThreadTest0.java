package java8;

class ThreadA extends Thread
{

	@Override
	public void run() {
		//		long start0 = System.currentTimeMillis();
		//		for(;;)
		//		{
		//			if (System.currentTimeMillis() -start0 > 100)
		//				break;
		//		}
		// TODO Auto-generated method stub
		for (int i =0;i<10;i++)
		{
			System.out.println("A");
			long start = System.currentTimeMillis();
			for(;;)
			{
				if (System.currentTimeMillis() -start > 100)
					break;
			}
		}

	}
}

class ThreadB extends Thread
{


	@Override
	public void run() {

		for (int i =0;i<10;i++)
		{
			System.out.println("B");
			long start = System.currentTimeMillis();
			for(;;)
			{
				if (System.currentTimeMillis() -start > 100)
					break;
			}
		}
	}
}

public class ThreadTest0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This seems to always print A first, because "new ThreadB()" call in the main thread loses CPU 
		// new ThreadA().start();
		// new ThreadB().start();
		
		// This occasionally print B first, because OS schedules threads in an unpredictable way.
		ThreadA A = new ThreadA();
		ThreadB B = new ThreadB();
		A.start();
		B.start();

	}

}
