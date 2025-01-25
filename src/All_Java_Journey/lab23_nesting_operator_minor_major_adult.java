package All_Java_Journey;

public class lab23_nesting_operator_minor_major_adult {
    public static void main(String[] args) {
        String age_string= args[0];

        // age<18 minor
        // age>18 adult
        // age>65 senior
        String result= (age<18) ? "minor" : (age>65) ? "senior" : "adult";
        System.out.println(result);

    }
}
