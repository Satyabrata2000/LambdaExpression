package LambdaExpression;

//Lambda expression with or without return keyword
public class Example10 {

    public static void main(String[] args) {

        //Lambda expression without return keyword
        Example8 obj1 = (a, b) -> (a+b);
        System.out.println(obj1.add(10, 20));

        //Lambda expression with return keyword
        Example8 obj2 = (int a, int b) -> {
            return (a+b);
        };
        System.out.println(obj2.add(100, 200));
    }
}
