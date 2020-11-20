import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {

    StringCalculator stringCalc = new StringCalculator();

    @Test
    public void emptyStringReturnsZero() throws NegativeValueException {

        // Returns 0 when an empty string is passed
        Assert.assertEquals(0, stringCalc.Add(""));
    }

    @Test
    public void singleValueIsReturned() throws NegativeValueException {
        // Returns the number itself when only one value is passed
        Assert.assertEquals(1, stringCalc.Add("1"));
        Assert.assertEquals(2, stringCalc.Add("2"));
    }

    @Test
    public void twoNumbersCommaDelimitedReturnsSum() throws NegativeValueException {
        // Returns the sum of the two numbers delimited by a comma
        Assert.assertEquals(3, stringCalc.Add("1,2"));
        Assert.assertEquals(5, stringCalc.Add("2,3"));

    }

    @Test
    public void unknownAmountOfNumbersCommaDelimitedReturnSum() throws NegativeValueException {
        Assert.assertEquals(10, stringCalc.Add("1,2,3,4"));
        Assert.assertEquals(55, stringCalc.Add("1,2,3,4,5,6,7,8,9,10"));
    }

    @Test
    public void unknownAmountOfNumbersNewLineDelimitedReturnSum() throws NegativeValueException {
        Assert.assertEquals(6, stringCalc.Add("1\n2,3"));
        Assert.assertEquals(10, stringCalc.Add("1\n2\n3\n4"));
    }

    @Test
    public void unknownAmountOfNumbersAnyDelimitedReturnSum() throws NegativeValueException {
        Assert.assertEquals(3, stringCalc.Add("//;\n1;2"));
    }

    @Test
    public void avoidAddingNumberGreaterThan1000() throws NegativeValueException {
        Assert.assertEquals(3, stringCalc.Add("3,1001"));
    }

    @Test
    public void negativeInputReturnsException() {
        try {
            stringCalc.Add("3,4,-2,-1,10,-5");
        }
        catch (NegativeValueException e) {
            System.out.println(e);
        }
    }

}
