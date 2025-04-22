// count word in a string
import java.io.*;
import java.util.*;
public class count_word_02{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' ' && input.charAt(i-1)!=' '){
                count++;
            }
        }
        if(input.length()>0){
            count++;
        }
        System.out.println(count);
    }
}
// if we make space in the end it consider as a word - change code
