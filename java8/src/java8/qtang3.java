package java8;

import java.util.ArrayList;

public class qtang3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> data = new ArrayList<String>();
		data.add("TQ");
		data.add("LJ");
		data.add("Claire");
		data.forEach(System.out::println);
		data.forEach(e -> System.out.println(e.toUpperCase()));
	}

}
