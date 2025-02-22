package ex24_absraction;

public class lab112_own_example {
    public static void main(String[] args) {
        vikas v=new vikas();
        v.new_at_pune();
        v.yashovihar();
    }
}

abstract class prabhakar {
    abstract void yashovihar();
}

class vikas extends prabhakar{
    @Override
    void yashovihar() {
        System.out.println("vikas will use this same");
    }
    void new_at_pune(){
        System.out.println("vikas will have 2nd one");
    }


}

