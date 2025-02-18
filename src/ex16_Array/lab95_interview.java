package ex16_Array;
import java.util.Arrays;
public class lab95_interview {
    public static void main(String[] args) {
        int[]marks={1,2,3,4,5,6};
        int[] marks2=new int[5]; //by new operator
        System.out.println(Arrays.toString(marks));

        marks2[0]=90;
        marks2[1]=95;

        System.out.println( marks2[0]);
    }
}
