package ex10_conditions;

public class lab52_IF_ELSE_CONDITION {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);

        if(age>18){
            System.out.println("ok you can vote");
        }
        else{
            System.out.println("sorry bro you cant vote ");
        }
    }
}
