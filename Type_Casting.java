import java.util.Scanner;

public class Type_Casting {
    public static void main(String[] args) {
        float myFloat = 5L;
//        Here 'L' is long and if we want to write the double value in the float datatype variable then we can't. It is because the size of the float is smaller than the size of double.
        int num = (int) 5.45f;
//        Here (int) convert the 5.0f into Integer.] and store it into the int num variable.
        System.out.println(myFloat);

        System.out.println(num);
    }
}
