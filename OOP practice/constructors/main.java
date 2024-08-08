package constructors;

public class main {
    public static void main(String[] args) {
        
        human human = new human("Lokesh" ,19,71.5);
        human someoneelse = new human("Lokesh Waran",19,68);
        
        System.out.println(human.name);

        System.out.println(someoneelse.name);

        human.eat();

        someoneelse.drink();
    }
    
}
