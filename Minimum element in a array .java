//Minimum element in a array 
import java.io.*;
import java.util.*;
public class min_in_array
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in a array :");int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=input.nextInt();
		}
		int min=arr[0];
		for(int j=1;j<n;j++){
		    if(arr[j]<arr[0]){
		        min = arr[j];
		    }
		}
		System.out.println("The Minimum number in a array: "+min);
	}
}
