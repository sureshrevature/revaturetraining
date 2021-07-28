package eg1;

import java.util.Scanner;

public class subString {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Website Url");
		String s=sc.nextLine();
		String s1=s.substring(0,5);
		String h="https";
		if(s1.equals(h)) {
			System.out.println("Secure");
		}
		else {
			System.out.println("not secure");
		}
	}

}
