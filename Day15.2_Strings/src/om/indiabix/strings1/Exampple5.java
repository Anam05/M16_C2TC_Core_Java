package om.indiabix.strings1;
import java.util.StringTokenizer;
public class Exampple5 {
	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("Lets Try This");
		while(st.hasMoreTokens())
		System.out.println(st.nextToken());

	}

}

