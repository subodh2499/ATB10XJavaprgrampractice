package ex13_functions;

public class lab86_with_parameter_without_return_type {
    public static void main(String[] args) {
        voting_can_be_done_by("subodh patil");

        subodh_details_are("subodh",24,20000);

    }
    static void voting_can_be_done_by(String name){
        System.out.println("voting should be done by" + name);
    }

    static void subodh_details_are(String name, int age,double salary){
        System.out.println("\nyour name is "+name + "\nyour age is "+age  +"\nyour salary is "+salary);
    }

}
