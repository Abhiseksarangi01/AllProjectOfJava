package pack1;

import java.util.Random;

public class RandomExample {
public static void main(String[] args) {
	Random rd=new Random();
	System.out.println(rd.nextInt());
	System.out.println(rd.nextInt(-1+10)-10);
	System.out.println(rd.nextFloat());
	System.out.println(rd.nextDouble());
	System.out.println(rd.nextLong());

}
}
