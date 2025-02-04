package ex13_functions;

public class lab85_Without_Parameters_and_With_Return_Type {
    public static void main(String[] args) {
String s=subodh(); //this is calling in this type
        System.out.println(s);

        int age_for_voting=age_to_vote();
        System.out.println("voter age is"+  age_for_voting);
    }
    static String subodh(){   // this is declaration
        return("ok fine");
    }



    static int age_to_vote(){
        return(18);
    }

}
