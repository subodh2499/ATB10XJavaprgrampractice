package Interview_types_importants;
import java.util.Scanner;
public class ex1_factorial_of_number {
    public static void main(String[] args) {

        //Write programme for finding the factorials


        Scanner Scanner=new Scanner(System.in);
        System.out.println("give the value for factorial");
        int num= Scanner.nextInt();

//intialisation

        int factorial=1;

        //conditions and updation,
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("factorial of" + num +"is" + factorial);


    }
}
