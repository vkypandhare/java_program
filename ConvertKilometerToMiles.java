package exercise;
import java.util.*;
public class ConvertKilometerToMiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Kilometer");
        float kilometer = sc.nextFloat();
        float miles = (float) (kilometer*0.62137119);
        System.out.println("Miles is the :-"+miles);


    }
}
