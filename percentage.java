package exercise;
import java.util.*;

public class percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a First Subject mark");
        int sub_mark1= sc.nextInt();
        System.out.println("Enter a second Subject mark");
        int sub_mark2= sc.nextInt();
        System.out.println("Enter a third Subject mark");
        int sub_mark3= sc.nextInt();
        System.out.println("Enter a forth Subject mark");
        int sub_mark4= sc.nextInt();

        int TotalOfMarks = sub_mark1+sub_mark2+sub_mark3+sub_mark4;
        float  percentage= (float) (TotalOfMarks * 100) /400;
        System.out.println("Total Obtain marks:- "+TotalOfMarks);
        System.out.println("Percentage of Student:- "+percentage);


    }
}
