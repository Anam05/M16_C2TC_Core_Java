package om.indiabix.strings1;

public class Example2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("try");
		System.out.println(sb);//16
		sb.setCharAt(3, 'x');
		System.out.println(sb);

	}

}
