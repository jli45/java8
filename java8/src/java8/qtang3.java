package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class qtang3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> data = new ArrayList<String>();
		data.add("TQ");
		data.add("LJ");
		data.add("Claire");

		data.forEach(System.out::println);
		data.forEach(e -> System.out.println(e.toUpperCase()));
		data.stream().map(elem -> elem.length()).collect(Collectors.toList()).forEach(System.out::println);
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int i = 0;
				while(true){
					i = i + 1;
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
		}).start();
		
	}

}
