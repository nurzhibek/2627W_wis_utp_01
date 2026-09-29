import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Subtractor subrtractor = new Subtractor();

        System.out.println(subtractor.subtract(6, 3));
    }
}
