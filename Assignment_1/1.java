// Write a java program to print first 10 numbers in Fibonacci sequence. Also print the sum of the numbers.


import java.io.*;
import java.util.*;

class fibonacci{

    void printfibo(int n)
    {
        int n1=-1, n2=1, n3, i, sum=0;
        
        for(i=1;i<=n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            sum=sum+n3;
            System.out.print(" "+n3);

        }
        System.out.print("\nSum of the fibonacci is "+sum);
        
    }
}
public class fibo
{
    public static void main(String []args){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        fibonacci obj=new fibonacci();
        obj.printfibo(num);
    }
}
