package ex07_nested_ternary;

public class lab49_bigger_from_3 {
    public static void main(String[] args) {
        //find the bigger fromm this 3
        int a=80;
        int b=20;
        int c=30;
        int max=a>b ? ((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}
