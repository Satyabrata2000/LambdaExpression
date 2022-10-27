package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

//Lambda expression example: forEach loop
public class Example11 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add("String 4");

        list.forEach((n)-> System.out.println(n));
    }
}
