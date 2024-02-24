package operaters.arithmatic;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Two numbers");
        num1=scanner.nextInt();
        num2=scanner.nextInt();

        //Relation or caparison Operator
        System.out.println(num1>num2);//false
        System.out.println(num1<num2);//false
        System.out.println(num1<=num2);//true
        System.out.println(num1>=num2);//true
        System.out.println(num1==num2);//true
        System.out.println(num1!=num2);//true
        System.out.println("\n");

        //Logical Operators
        System.out.println(num1>num2 && num1==num2);//false
        System.out.println(num1>num2 || num1<num2);//false
        System.out.println(num1 != num2 );//false
        System.out.println("\n");

        //AND
        System.out.println("Logical AND");
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && false);//false
        System.out.println(false && true);//false
        //System.out.println(4&&5);//CTE
        System.out.println("\n");

        //OR
        System.out.println("Logical AND");
        System.out.println(true || true);//true
        System.out.println(true || false);//false
        System.out.println(false || false);//false
        System.out.println(false || true);//false
        System.out.println("\n");

        //NOT
        System.out.println(!true);//false
        System.out.println(!false);//true
        System.out.println(10 % 2 == 0);//true
        System.out.println(10 % 2 != 0);//false
        System.out.println(2023 % 4 != 0);//true
        System.out.println("\n");

    }

}

