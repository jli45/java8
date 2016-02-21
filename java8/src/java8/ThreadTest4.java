package java8;

public class ThreadTest4 {

	static class ThreadA extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();

			while(true)
			{
				try 
				{
					ThreadA.sleep(1000);
					System.out.println("tA is running");
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("tA is interupted");
					//break;
				}

			}

			//			if (this == Thread.currentThread())
			//			{
			//				System.out.println("yes");
			//			}
			//			else
			//			{
			//				System.out.println("no");
			//			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		ThreadTest4.ThreadA tA = new ThreadTest4.ThreadA();
		//tA.setDaemon(true);
		tA.start();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tA.interrupt();
		System.exit(0);
		


	}

}
