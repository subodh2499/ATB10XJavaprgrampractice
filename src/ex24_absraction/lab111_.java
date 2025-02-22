package ex24_absraction;

public class lab111_ {
    public static void main(String[] args) {
        child c=new child();
        c.loan50k();
        c.loan25k();


    }
}
abstract class father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("paid");
    }

}
class child extends father{
    @Override
    void loan50k() {
        System.out.println("child will pay this");
    }

}
