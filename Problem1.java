import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        Calculator calc = new Calculator();


        if (operation.equalsIgnoreCase("add")) {
            System.out.println("Result: " + calc.add(a, b));
        } else if (operation.equalsIgnoreCase("sub")) {
            System.out.println("Result: " + calc.sub(a, b));
        } else if (operation.equalsIgnoreCase("mul")) {
            System.out.println("Result: " + calc.mul(a, b));
        } else if (operation.equalsIgnoreCase("div")) {
            if (b != 0) {
                System.out.println("Result: " + calc.div(a, b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation. Please enter add, sub, mul, or div.");
        }

        sc.close();
    }
}

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}

