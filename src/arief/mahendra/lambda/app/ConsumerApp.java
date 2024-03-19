package arief.mahendra.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println(name);
        consumer.accept("arief");
    }
}
