package ex16_Array;

public class lab101_sum_of_array {
    public static void main(String[] args) {
        int[]numbers={10,20,30};

        //make sum of them.
     int sum=0;
        for(int i=0;i<numbers.length;i++) {
            sum = sum + numbers[i];
        }
            System.out.println(sum);


    }
}
