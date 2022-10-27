package LambdaExpression;

public class Example7 {

    public static void main(String[] args) {
        //Lambda expression with single parameter
        Example6 obj1 = (name) -> {
            return "Hello " + name;
        };
        System.out.println(obj1.use("Text Alert"));

        //We can skip function parenthesis
        Example6 obj2 = name -> {
            return "Hello " + name;
        };
        System.out.println(obj2.use("Second alert"));
    }
}
