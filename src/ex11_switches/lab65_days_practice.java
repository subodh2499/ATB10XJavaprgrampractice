package ex11_switches;
import java.util.Scanner;
public class lab65_days_practice {

    // programme for write the day on each number ex- 1-sunday 2-monday ...7-saturday

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number between 1 to 7");
        int day=sc.nextInt();

        switch (day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("no idea bro");
        }

    }
}
