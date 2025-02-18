package ex16_Array;

import java.util.Arrays;

public class lab96 {
    public static void main(String[] args) {
        int[] marks = {90, 92, 93, 98, 88};
        System.out.println(marks.length);
        System.out.println(marks[0]); // this is normal way of printing.

        //printing using for loop.
        for (int i = 0; i < marks.length; i++) {
            ;
            System.out.println(marks[i]);


            Arrays.sort(marks);
        }
    }
}

