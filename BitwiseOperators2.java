package operaters.arithmatic;

public class BitwiseOperators2 {
    public static void main(String[] args) {
        System.out.println("Left shift");
        System.out.println(4 << 1); //8
        System.out.println(8 << 5);//256
        System.out.println(2 << 1);//4
        System.out.println(12 << 3);//96

        System.out.println("Right shift");
        System.out.println(4 >> 1); //2
        System.out.println(16 >> 5);//0
        System.out.println(32 >> 2);//8
        System.out.println(12 >> 3);//1

        System.out.println("Negation");
        System.out.println(~4); //-5
        System.out.println(~-5);//4
        System.out.println(~50);//49


    }
}
