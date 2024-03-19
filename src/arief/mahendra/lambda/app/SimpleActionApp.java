package arief.mahendra.lambda.app;

import arief.mahendra.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        SimpleAction simpleAction = (String name) -> {
            return name;
        };

        System.out.println(simpleAction.action("arief"));

        SimpleAction simpleAction1= (name) -> {
            return name;
        };

        System.out.println(simpleAction1.action("mahendra"));


        // lambda tanpa block
        SimpleAction simpleAction2 = (String name) -> name;
        SimpleAction simpleAction3 = (name) -> name;
        SimpleAction simpleAction4 = name -> name;

        System.out.println(simpleAction2.action("arief"));
        System.out.println(simpleAction3.action("mahendra"));
        System.out.println(simpleAction4.action("keren"));

    }
}
