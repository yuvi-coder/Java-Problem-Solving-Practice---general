// To find Vowels and Consonants in a string
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int vowles=0;
        int consonants=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                vowles++;
            }
            else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                consonants++;
            }
        }
        System.out.println("Vowels = "+vowles);
        System.out.println("Consonants = "+consonants);
    }
}


// vowels count using array method 

/* import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] characters=input.toCharArray();
        int vowelcount = 0;
        for(int i=0;i<characters.length;i++){
            char c=characters[i];
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                vowelcount++;
            }
        }
        System.out.println(vowelcount);
    }
} */
