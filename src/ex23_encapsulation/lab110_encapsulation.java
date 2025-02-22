package ex23_encapsulation;

public class lab110_encapsulation {
    public static void main(String[] args) {
        ICICIBank amit  =new ICICIBank("amit",1000);
        System.out.println(amit.getBal());

        boolean is_cashier=true;
        amit.setBal(1200,true);
        System.out.println(amit.getBal());
    }

}
      class ICICIBank{
       private String name;
       private  long bal;

          public ICICIBank(String name, long bal) {
              this.name = name;
              this.bal = bal;
          }

          public String getName() {
              return name;
          }

          public void setName(String name) {
              this.name = name;
          }

          public long getBal() {
              return bal;
          }

          public void setBal(long bal,boolean is_cashier) {
              if(is_cashier)
              {this.bal=bal;}
              else{
                  System.out.println("not allowed");
              }
          }
      }



