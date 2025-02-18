package ex18_consructor;

public class lab109_parameterised_constructor {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("i phone 16","2025");
                Mobile oneplus=new Mobile("CE3","2024");
        System.out.println(iphone.model_name);
        System.out.println(iphone.year_of_launch);
    }

}
class Mobile {
    String model_name;
    String year_of_launch;

    Mobile(String model_name_c, String year_of_launch_c) {
        this.model_name = model_name_c;
        this.year_of_launch = year_of_launch_c;
    }
}