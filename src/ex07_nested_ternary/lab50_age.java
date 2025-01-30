package ex07_nested_ternary;

public class lab50_age {
    public static void main(String[] args) {
        //<18 minor
        //>18 adult
        //>65 senior
        int age=45;
        String result= age<18 ? "minor": (age>18&&age<65? "adult":"senior");
        System.out.println(result);
    }
}
