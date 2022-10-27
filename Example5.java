package LambdaExpression;

//Lambda expression with no parameter
public class Example5 {

    public static void main(String[] args) {

        Example4 obj =() -> {
            return "Nothing to say";
        };
        System.out.println(obj.use());
    }
}
