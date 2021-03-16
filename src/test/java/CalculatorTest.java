import static org.junit.Assert.*;
import org.apache.logging.log4j.core.pattern.NotANumber;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void truepositivefactorial(){
        assertEquals("Finding Factorial of integer number for True Positive", 24, calculator.Factorial(4), DELTA);
        assertEquals("Finding Factorial of integer number for True Positive", 40320, calculator.Factorial(8), DELTA);
        assertEquals("Finding Factorial of integer number for True Positive", Double.NaN, calculator.Factorial(7.7), DELTA);
    }

    @Test
    public void TrueNegativeFactorial(){
        assertEquals("Finding Factorial of negative integer number for True Negative",Double.NaN, calculator.Factorial(-6), DELTA);
    }

    @Test
    public void FalsePositivefactorial(){
        assertNotEquals("Checking for False Factorial Value", 4, calculator.Factorial(2),DELTA);
        assertNotEquals("Checking for False Factorial Value", 75, calculator.Factorial(8), DELTA);
        assertNotEquals("Checking for False Factorial Value", 75, calculator.Factorial(8.8), DELTA);
    }

    @Test
    public void truepositivesquareroot(){
        assertEquals("Finding Square Root of positive number for True Positive", 8, calculator.squareroot(64), DELTA);
        assertEquals("Finding Square Root of positive number for True Positive", 11, calculator.squareroot(121), DELTA);
    }


    @Test
    public void SquareRootFalsePositive(){
        assertNotEquals("Checking Square root of positive integer number for False Positive", 4, calculator.squareroot(9), DELTA);
        assertNotEquals("Checking Square root of positive double number for False Positive", 6.23, calculator.squareroot(16.7), DELTA);
    }

    @Test
    public void naturallogtruepositive(){
        assertEquals("Dividing two integer numbers for True Positive",2.302585092994046 , calculator.naturallog(10), DELTA);
        assertEquals("Dividing two double numbers for True Positive", 2.1041341542702074, calculator.naturallog(8.2), DELTA);
    }

    @Test
    public void naturallogFalsePositive(){
        assertNotEquals("Checking natural log of integer number for False Positive", 2.154, calculator.naturallog(8), DELTA);
        assertNotEquals("Checking natural log of double number for False Positive", 7.3, calculator.naturallog(46.4), DELTA);
        assertNotEquals("Dividing two double numbers for True Positive", 1, calculator.naturallog(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void powertruepositive(){
        assertEquals("checking power of integer numbers for True Positive", 27, calculator.powofnum(3, 3), DELTA);
        assertEquals("checking power of integer numbers for True Positive", 1, calculator.powofnum(0, 0), DELTA);
        assertEquals("checking power of double numbers for True Positive", 2.4359207431734027, calculator.powofnum(2.1, 1.2), DELTA);
        assertEquals("checking power of integer numbers for True Positive", Double.NaN, calculator.powofnum(1, Double.POSITIVE_INFINITY), DELTA);
        assertEquals("checking power of integer numbers for True Positive", Double.NaN, calculator.powofnum(1, Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void powerfalsepositive(){
        assertNotEquals("checking power of integer numbers for false positive",5,calculator.powofnum(2,3),DELTA);
        assertNotEquals("checking power of double numbers for false positive",2.12154,calculator.powofnum(2.1,1.2),DELTA);

    }

}