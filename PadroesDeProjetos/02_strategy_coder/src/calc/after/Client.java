package calc.after;

import calc.after.strategies.AdditionOperation;
import calc.after.strategies.MultiplicationOperation;
import calc.after.strategies.SubtractionOperation;

public class Client {


    public static void main(String[] args) {

        Calculator calc = new Calculator(10, 2);

        System.out.println(calc.getResult(new AdditionOperation()));
        System.out.println(calc.getResult(new SubtractionOperation()));
        System.out.println(calc.getResult(new MultiplicationOperation()));
        System.out.println(calc.getResult(new AdditionOperation()));

        System.out.println(calc.getResult(
                (num1, num2) -> (int) Math.pow(num1, num2)));

    }
}
