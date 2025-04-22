// Simple string palindrome(reversing the given string or int should be same as the original striing or int)
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        String reverse="";
        for(int i=a.length()-1;i>=0;i--){
            reverse += a.charAt(i);
        }
        if(a.equals(reverse)){
            System.out.println(a+" is a palindrome");
        }
        else{
            System.out.println(a+" is not a palindrome");
        }
    }
}
