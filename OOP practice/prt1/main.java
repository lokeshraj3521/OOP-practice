package prt1;

public class main {
    public static void main(String[] args) {
        
        car mycar1= new car();
        car mycar2= new car();

        System.out.println(mycar1.model);
        System.out.println(mycar1.price);
        
        System.out.println(mycar2.model);
        System.out.println(mycar2.price);

        mycar1.drive();
        mycar2.brake();
    }
    
}