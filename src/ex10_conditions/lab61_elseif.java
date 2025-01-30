package ex10_conditions;

import java.util.Scanner;

public class lab61_elseif {
    public static void main(String[] args) {
        // find greater between n1 and n2 and user scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int number1=sc.nextInt();
        System.out.println("enter number 2");
        int number2=sc.nextInt();

        if(number1>number2){
            System.out.println("number 1 is greater");
        }
        else if(number1<number2){
            System.out.println("number 2 is greater");
        }
        else{
            System.out.println("equal");
        }
    }
}
