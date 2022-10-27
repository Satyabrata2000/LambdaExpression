package LambdaExpression;

public class Example2 {

    public static void main(String[] args) {
         int width = 10;

         //Without lambda, Example1 interface implementation using anonymous class

        Example1 obj = new Example1() {
            @Override
            public void use() {
                System.out.println("Example " + width);
            }
        };
        obj.use();
    }
}
