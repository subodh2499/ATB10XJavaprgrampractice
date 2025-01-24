package All_Java_Journey;

public class lab21_bigger_number_from_n1n2n3 {
    public static void main(String[] args) {
        int n1=2;
        int n2=9;
        int n3=-11;
        int max= (n1>=n2) ? ((n1>=n3) ? n1:n3): ((n2>=n3)? n2:n3);
        System.out.println(max);
    }
}
