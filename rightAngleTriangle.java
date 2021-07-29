package eg1;

import java.util.Scanner;

public class rightAngleTriangle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter value of a;");
	int a=sc.nextInt();
	System.out.println("Enter value of b;");
	int b=sc.nextInt();
	int as=Math.pow(a,2);
	int bs=Math.pow(b, 2);
	System.out.println("value of c:"+(as+bs));
	sc.close();
	
	}


}
