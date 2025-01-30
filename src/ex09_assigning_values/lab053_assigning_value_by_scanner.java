package ex09_assigning_values;

import java.util.Scanner;

public class lab053_assigning_value_by_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Fix capitalization of 'System'
        System.out.println("Type age:");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Ok bhau tu vote kr"); // Maintain casual phrasing
        }
        else{
            System.out.println("nahi bhau nahi jamnar tula attach");
        }
    }
}