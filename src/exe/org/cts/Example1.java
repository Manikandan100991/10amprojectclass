package exe.org.cts;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		System.out.print("Enter grade : ");
		Scanner k =new Scanner(System.in);
	 char grade =k.next().charAt(0);
	 
switch(grade)
{
case 'A' : System.out.print("50% Offer");break;
case 'B' : System.out.print("30% Offer");break;
case 'C' : System.out.print("10% Offer");break;
case 'D' : System.out.print("No Offer");break;
case 'E' : System.out.print("No Offer");break;
default : System.out.print("Invalid Grade");break;
}
	 
	 }
	 
	 
}