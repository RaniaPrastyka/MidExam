/**
 * Midterm-Exam
 * IS184203 - Algorithm and Programming
 * Class: C
 * Student ID: 5026211042
 * Name: Rania Prastyka
 */

import java.util.Scanner;
public class MidExam{
    
    
    public static void main (String[] args) {
        
        
        //Problem (1):
        //Ask the user to enter their fullname, and store to a varibale name
        
        System.out.println("Write your code for Problem 1 here!");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        
        //Problem (2):
        //Print out "Hi last name!" for example when the use enter: "Anna Julaikha", the output will be "Hi Julaikha!"
        
        System.out.println("Write your code for Problem 2 here!");
        
        String[]name_splitted = name.split(" ");
        System.out.println("Hi "+ name_splitted[name_splitted.length-1] + "!");
        
        //Problem (3):
        //write a code here to check whether the user first name is a palindrome
        
        System.out.println("Write your code for Problem 3 here!");
        
        String[] haha = name.split(" ");
        String a = haha[0];
        
                System.out.println("your first name is: "+a);
       
        
        //Problem (4):
        //Print out whether the user firstname is a palindrome, e.g. if the input is Anna Julaikha, then the output is: your first name is a palindrome
        //if the input is Doni Damara, then the output is: your first name is a not palindrome
        
        System.out.println("Write your code for Problem 4 here!");
        
         String rev = "";
         int length = a.length();
            for ( int i = length - 1; i >= 0; i-- )
            rev = rev + a.charAt(i);
         if (a.equals(rev))
            System.out.println("your first name is a polindrome");
        else
            System.out.println("your first name is not a polindrome");
        
    }
}