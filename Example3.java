package LambdaExpression;

public class Example3 {

    public static void main(String[] args) {

        int width = 10;

        //With lambda

        Example1 obj2 = () -> {
            System.out.println("Example " + width);
        };
        obj2.use();
    }
}
