package eg1;

import java.util.Scanner;

public class rightAngleTriangle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter value of a;");
	int a=sc.nextInt();
	System.out.println("Enter value of b;");
	int b=sc.nextInt();
	int as=a*a;
	int bs=b*b;
	System.out.println("value of c:"+(as+bs));
	
	}


}
