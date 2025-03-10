import java.io.*;
import java.util.*;
class Sequence
{
	void seq(int num){
		int i, a=1;
		for(i=1;i<=num;i++){
		a*=i;
		System.out.print((2*i)+", "+a+", ");
		
		}
	}
}

class sequence{

	public static void main(String a[]){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		n=sc.nextInt();
		Sequence obj=new Sequence();
		obj.seq(n);
	}
}
