import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("****Calculator-DevOps, Choose to perform operation****");
            System.out.print("Press 1 to Factorial\nPress 2 to Square root\nPress 3 to Natural log\nPress 4 to power\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Factorial option chosen");
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial result is : " + calculator.Factorial(number1));
                    break;
                case 2:
                    System.out.println("Square root option chosen");
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                    if(number1<0)
                    {
                        number1=number1*-1;
                        double res=calculator.squareroot(number1);
                        System.out.println("Square root result is : " +"+"+ res+"i\n"+"-"+ res+"i");
                    }
                    else
                    {
                        double res=calculator.squareroot(number1);
                        System.out.println("Square root result is : "+"+" + res+"\n-"+res);
                    }
                    break;

                case 3:
                    System.out.println("natural log option chosen");
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("naturallog: " + calculator.naturallog(number1));
                    break;
                case 4:
                    System.out.println("pow option chosen");
                    System.out.print("Enter the number 1: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the number 2: ");
                    number2 = scanner.nextDouble();
                    System.out.println("pow result is : " + calculator.powofnum(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public double powofnum(double number1,double number2) {
        double result = 0;
        logger.info("[powerofnum] : (" + number1 +","+number2+")");
        result = Math.pow(number1,number2);
        logger.info("[RESULT - powerofnum] : " + result);
        return result;
    }

    public double Factorial(double number1) {
        double result = 1;
        int i;
        logger.info("[Factorial] : " + number1);
        if (number1 < 0||number1!=(int)number1)
            result = Double.NaN;
        else
            for (i = 1; i <= number1; i++) {
                result = result * i;
            }
        logger.info("[Result - Factorial] : " + result);
        return result;
    }

    public double naturallog(double number1) {
        logger.info("[natural log] : " + number1);
        double result = 0;
        result = Math.log(number1);
        logger.info("[RESULT - natural log] : " + result);
        return result;
    }

    public double squareroot(double number1) {
        logger.info("[square root] : " + number1);
        double result = 0;
        result = Math.sqrt(number1);
        logger.info("[RESULT - square root] : " + result);
        return result;
    }

}