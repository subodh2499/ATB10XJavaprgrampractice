package ex16_Array;

import java.util.Arrays;

public class lab103_second_largest {
    public static void main(String[] args) {
        int[] numbers={10,40,02,55,14};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
