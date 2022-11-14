package pack2;

public class ModifyStringExample {
	public static void main(String[] args) {
		String S="ABCDEFGHIJKLML";
		System.out.println(S);
		System.out.println(S.length());
       System.out.println(S.toUpperCase());
       System.out.println(S.toLowerCase());
       System.out.println(S.concat("NOPQRST"));
       System.out.println(S);
       System.out.println(S.charAt(1));
       System.out.println(S.codePointAt(1));
       System.out.println(S.indexOf("L"));
       System.out.println(S.lastIndexOf("L"));
       System.out.println(S.startsWith("A"));
       System.out.println(S.endsWith("L"));
       System.out.println(S.contains("DEF"));
       
       
       
	}

}
