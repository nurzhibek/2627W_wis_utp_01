import java.sql.SQLOutput;

// TODO: we need to add missing classes!

// OK, I will add 'Subtractor' and s36160 will add 'Adder'

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}
