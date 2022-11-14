package pack1;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	
public static void main(String[] args) {
	
	StringTokenizer st=new StringTokenizer("H:EL;L;O;",":;");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
