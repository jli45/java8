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

		new ThreadA().start();
		new ThreadB().start();

	}

}
