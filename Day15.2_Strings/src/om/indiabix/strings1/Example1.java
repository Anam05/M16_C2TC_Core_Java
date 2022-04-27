package om.indiabix.strings1;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb = new StringBuffer(s.nextLine());//17
		System.out.println(sb.capacity());//16
		//System.out.println(str);
		s.close();
		
		
		

	}

}
