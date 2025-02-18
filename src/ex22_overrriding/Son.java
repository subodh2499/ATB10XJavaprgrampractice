package ex22_overrriding;

public class Son extends father {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void home(){
        System.out.println("2BHK");
    }
}
