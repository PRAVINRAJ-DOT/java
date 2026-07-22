import java.util.Scanner;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a * b == c*c){
		   System.out.print("YES");
		}
        else{
            System.out.print("NO");
        }
	}
}
