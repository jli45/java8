package java8;



class PrepareThreadA extends Thread
{

	private Object object;

	PrepareThreadA (Object object)
	{
		this.object = object;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		long start1 = System.currentTimeMillis();
////		for(;;)
////		{
////			if (System.currentTimeMillis() -start1 > 1000)
////				break;
////		}
		synchronized (object) {
			System.out.println("Thread A is preparing");
			System.out.println("Thread A is done");
			object.notify();
		}

	}
}

class PrepareThreadB extends Thread
{
	private Object object;

	PrepareThreadB (Object object)
	{
		this.object = object;
	}

	@Override
	public void run() {
		
		synchronized (object) {
			// TODO Auto-generated method stub
			System.out.println("Thread B is preparing");
			System.out.println("Thread B is done");
			object.notify();
		}
	}
}

class ServerThread extends Thread 
{
	private Object object;

	ServerThread (Object object)
	{
		this.object = object;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Server Thread waits");
		synchronized (object) {
			try {
				object.wait();
				System.out.println("Server Thread waits");
				//object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			System.out.println("Server Thread starts");
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new Object();
		new ServerThread(object).start();
		(new PrepareThreadA(object)).start();
		new PrepareThreadB(object).start();
		
		
	}

}
