package java8;

//od -t d -j 7 -N 1 classClass.class | head -1 | awk '{print "Java", $2 - 44}'
class classClass
{
	int age = 101;
	int big_age = 9999999;
	String name;
	final int final_age = 200;
	final static String type = "HUMAN";
	final static int MAX_AGE = 221;
	float pi = 3.14f;
	double pi_d = 33333333.1415;
	
	classClass(String name) 
	{
		
		//javap结果显示：类构造函数中的JVM指令是先实例化内成员变量，所以age（先赋值101， 然后才89），pi， name等先赋值，然后再给本地变量name1赋值。
		{
			String name1 = "TTTQQQ";
			this.age = 89;
			this.name = name;
			System.out.println(name1);
			
		}
		
		//javap显示虽然有4个局部变量（this， name， name1， name2, 但是局部变量表的SLOT其实3个就够了，因为name2的作用域已经超出了name1的
		//如果name2的那条语句在{}中，则SLOT还是4个，无法共用。
		String name2 = "test1";
		System.out.println(name2);
		
	}
	
	String getName()
	{
		return this.name;
	}
	
	int getAge()
	{
		return this.age;
	}

}

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
