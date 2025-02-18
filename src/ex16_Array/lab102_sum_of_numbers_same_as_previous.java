package ex16_Array;

public class lab102_sum_of_numbers_same_as_previous {
    public static void main(String[] args) {
        int[] numbers={10,20,30};
        int sum=0;

        for(int n:numbers){
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
