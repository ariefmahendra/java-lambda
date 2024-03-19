package arief.mahendra.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> function = name -> name.length();
        System.out.println(function.apply("arief"));
    }
}
