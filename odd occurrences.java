//odd occurrences  -- short below

/*In the context of data analysis or programming, "odd occurrences" typically refers to instances where an element or item appears an odd number of times within a dataset or array. 
This contrasts with elements that appear an even number of times, such as 2, 4, or 6. The phrase often arises in problems where the goal is to identify the element that appears an odd
number of times, either in isolation or as part of a broader pattern. 
Elaboration:
Definition:
"Odd occurrences" simply means that a particular element or item within a data set appears a number of times that is not divisible by 2. 
Context:
This concept is frequently encountered in problems involving arrays or lists where the goal is to identify unique or outlier elements. 
Example:
In an array, the element 4 appears once, which is an odd number of times, while the elements 5 and 6 each appear twice, which is an even number of times. 
Applications:
Finding a unique element: If all elements in an array appear an even number of times except one, the element appearing an odd number of times can be identified. 
Identifying outliers: "Odd occurrences" can help pinpoint data points that deviate from the typical pattern in a dataset. */

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){  //odd occurances 
                if (a[i]==a[j]){   //one loop completed and move to next loop.
                    count++;
                }
            }
            if(count%2==1){
                System.out.println(a[i]); //check the obtained number is odd.
                break;
            }
        }
    }
}
