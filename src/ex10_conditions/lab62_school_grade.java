package ex10_conditions;
import java.util.Scanner;
// ✅ Grade Calculator:
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

// Logic Building - Java (Copyright by Pramod Sir :D )


// Step 1
// Find the inputs / outputs
// Input | score -> (0 - 100) | data type -> int
// Output | grade -> data type -> char


// Step 2. Basic Logic |  Rough Logic
// if ( score >=90 && score <=100 -> return or print grade  - A
// else if ( score <=89 && score >=80-> return or print grade  - B
// else if score <=79 && score >= 70 -> return or print grade - C
// D,
//  // else -> grade -> F

// 3. Write the code


public class lab62_school_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score");
        int score=sc.nextInt();

        if(score>=90 && score<=100){
            System.out.println("A");
        }
        else if(score>=80 && score<=89){
            System.out.println("B");
        }
        else if(score>=70 && score<=79){
            System.out.println("C");
        }
        else if(score>=60 && score<=69){
            System.out.println("D");
        }
        else if(score>100 || score<0){
            System.out.println("such score in not possible bro");
        }
        else {
            System.out.println("FAIL");
        }





    }
}
