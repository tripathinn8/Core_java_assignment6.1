package myPack;
import java.io.*;
import java.lang.*;
public class myArray {

	public static void main(String[] args) {
		
		int[] a= new int [11];
		try
		{
		for(int i=1; i<12; i++)
		{
			
				a[i]=i;
			if(i%2==0)
			{System.out.println(a[i]);}		
		}}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size is exhausted");
		}
	}
	
}
