package pack2;

public class SystemClassExample {
public static void main(String[] args)throws Exception
{
	System.out.println("valid message");
	System.err.println("Error massage");
	int a=System.in.read();
	System.out.println(a);
	
	if((char)a=='e')
		System.exit(0);
	else 
		System.out.println("Normal Ending");
		
	
}
}
