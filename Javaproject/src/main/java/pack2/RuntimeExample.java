package pack2;


public class RuntimeExample {
public static void main(String[] args)throws Exception {
	Runtime rt=Runtime.getRuntime();
	
	System.out.println("free Memory before gc:  "+rt.freeMemory());
	System.out.println("total Memory before gc:  "+rt.totalMemory());
	
	rt.gc();
	
	System.out.println("free Memory after gc:  "+rt.freeMemory());
	System.out.println("total Memory after gc:  "+rt.totalMemory());
	
	rt.exec("notepad");
	//rt.exec("");

}
}
