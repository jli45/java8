package java8;

class Model
{
	private int age = 0;
	public Model(int age)
	{
		this.age= age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int newAge)
	{
		this.age= newAge;
	}
}

public class ThreadLocalTest {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 0;
		final Model model = new Model(0);
		final ThreadLocal<Model> model2 = new ThreadLocal<Model>(){
			@Override
			protected Model initialValue() {
				// TODO Auto-generated method stub
				return new Model(0);
			}
		};

		Thread tA = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				model.setAge(10);
				model2.get().setAge(10);
				System.out.println("model of A is : " + model.getAge());
				System.out.println("model2 of A is : " + model2.get().getAge());
			}
		});
		Thread tB = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("model of B is : " + model.getAge());
				System.out.println("model2 of B is : " + model2.get().getAge());
			}
		});

		tB.start();
		tA.start();

	}

}

