package arief.mahendra.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = value -> value.isBlank();

        System.out.println(predicate.test("     ")); // true
        System.out.println(predicate.test("arief")); // false
    }
}
