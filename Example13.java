package LambdaExpression;

//java lambda expression, multiple statements
public class Example13 {

    public static void main(String[] args) {

        //You can pass multiple statements in lambda expression
        Example12 obj = (message) -> {
            String str1 = "This is a beautiful day ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(obj.str("It's end of the week"));
    }
}
