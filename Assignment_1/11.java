import java.io.*;
import java.util.*;

class power_number
{
	void power(int a,int b)
	{
		System.out.print("The power of a number: "+(int) Math.pow(a,b));
	
	}
}
class power
{
	public static void main(String []a)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y=sc.nextInt();
		
		power_number obj=new power_number();
		obj.power(x,y);
	
	}
}
