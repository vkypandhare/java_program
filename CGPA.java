package exercise;

import  java.util.*;
public class CGPA {
    public static void main(String[] args) {
        Scanner cgpa= new Scanner(System.in);
        System.out.println("Enter a First Subject mark");
        float sub_mark1= cgpa.nextInt();
        System.out.println("Enter a second Subject mark");
        float sub_mark2= cgpa.nextInt();
        System.out.println("Enter a third Subject mark");
        float sub_mark3= cgpa.nextInt();


        float TotalOfMarks = (sub_mark1+sub_mark2+sub_mark3)/30;

        System.out.println("Total Obtain marks:- "+TotalOfMarks);


    }
}
