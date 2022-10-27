package LambdaExpression;

public class Example9 {

    public static void main(String[] args) {

        //multiple parameters in lambda expression
        Example8 obj1 = (a,b) -> (a+b);
        System.out.println(obj1.add(10, 20));

        //multiple parameters with data type in lambda expression
        Example8 obj2 = (int a, int b) -> (a+b);
        System.out.println(obj2.add(30, 50));
    }
}
