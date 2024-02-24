package operaters.arithmatic;

import java.util.Scanner;
public class OperatorsArithIncreDecreShorthand {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Two numbers");
        num1=scanner.nextInt();
        num2=scanner.nextInt();

        //arithmetic operators
        int add = num2 + num2;
        System.out.println("addition is :-"+add);
        int sub = num1 - num2;
        System.out.println("Subtraction is :-"+sub);
        int mul =  num2 * num2;
        System.out.println("multiplication is :-"+mul);
        float div = (float)  num1 / num2;
        System.out.println("Division is :-"+div);
        float rem = (float)  num1 % num2;
        System.out.println("Division is :-"+rem);

        //arithmetic shorthand operators
        add +=10;
        System.out.println("addition is :-"+add);
        sub -=10;
        System.out.println("Subtraction is :-"+sub);
        mul *=10;
        System.out.println("multiplication is :-"+mul);
        div /=5 ;
        System.out.println("Division is :-"+div);
        div %=5 ;
        System.out.println("Division is :-"+rem);

        //increment and decrement operators
        //pre increment
        add =++add;
        System.out.println("addition is :-"+add);
        sub =++sub;
        System.out.println("Subtraction is :-"+sub);
        mul =++mul;
        System.out.println("multiplication is :-"+mul);
        div =++div ;
        System.out.println("Division is :-"+div);
        rem =++rem ;
        System.out.println("Division is :-"+rem);

        // pre decrement
        add =--add;
        System.out.println("addition is :-"+add);
        sub =--sub;
        System.out.println("Subtraction is :-"+sub);
        mul =--mul;
        System.out.println("multiplication is :-"+mul);
        div =--div ;
        System.out.println("Division is :-"+div);
        rem =--rem ;
        System.out.println("Division is :-"+rem);

        // post increment
        add =add++;
        System.out.println("addition is :-"+add);
        sub =sub++;
        System.out.println("Subtraction is :-"+sub);
        mul =mul++;
        System.out.println("multiplication is :-"+mul);
        div =div++ ;
        System.out.println("Division is :-"+div);
        rem =rem++ ;
        System.out.println("Division is :-"+rem);

        // post decrement
        add =add--;
        System.out.println("addition is :-"+add);
        sub =sub--;
        System.out.println("Subtraction is :-"+sub);
        mul =mul--;
        System.out.println("multiplication is :-"+mul);
        div =div-- ;
        System.out.println("Division is :-"+div);
        rem =rem-- ;
        System.out.println("Division is :-"+rem);

    }
}
