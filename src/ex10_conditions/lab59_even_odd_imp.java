package ex10_conditions;

import java.util.Scanner;

public class lab59_even_odd_imp {
    public static void main(String[] args) {
// create programme by taking user input by scanner and find the number is odd or even
        Scanner sc = new Scanner(System.in); // Fix capitalization of 'System'
        System.out.println("Type number:");
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println("Even");
        }
        if(number==0) {
            System.out.println("dont add this");
        }
            if(number<0){
                System.out.println("negative not allowed");
            }

        else {
            System.out.println("odd");
        }
    }
}
