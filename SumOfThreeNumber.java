package exercise;
import java.util.*;

public class SumOfThreeNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Sum of Three number using user input");
        System.out.println("Enter a First Number");
        int no1=number.nextInt();
        System.out.println("Enter a First Number");
        int no2=number.nextInt();
        System.out.println("Enter a First Number");
        int no3=number.nextInt();
        System.out.println("User given input 1:-"+no1+"\tinput 2:-"+no2+"\tinput 3:-"+no3);
        int totalOfNumber = (no1+no2+no3);
        System.out.println("Total Number is:- "+totalOfNumber);





    }

}
