public class Data_Types {
    public static void main(String[] args) {
        int myNumber=6159;
//        int myNumber --> Declaration
//        6159 --> Intialisation.
         int yourNumber;
         yourNumber=865;
//         int -> Datatype.
//         myNumber -> variable.
//        865 -> Literals.
        System.out.println(yourNumber);
        yourNumber=45;
        System.out.println(yourNumber);


        float myFloat=61;
//        I am not writing 61.0 because it assume that number as a Double not float.
//        So We have to write '61' but it consider as a 61.0
        System.out.println(myFloat);


        float MyFloat=61.59f;
//        Here I write it in the float form because I write the letter (f/F) after the number.

        System.out.println(MyFloat);
        boolean isVeg= true;
        System.out.println(isVeg);

        String Wishes="Good Morning";
        System.out.println(Wishes);

        System.out.println("Hello \"ESCAPE Sequence\"..");
//        \"\" --> This is Escape Sequence means if we want to print something in double quotes , So we have to put the \ (backslash)  before the double quote.
        System.out.println("\\Double backslash\\");
//        Double backslash means that if we want to show the backslash in the output so we have to put the backslash.It will show single backslash.
    }
}
