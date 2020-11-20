import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {

    StringCalculator stringCalc = new StringCalculator();

    @Test
    public void emptyStringReturnsZero() {

        // Returns 0 when an empty string is passed
        Assert.assertEquals(0, stringCalc.calculate(""));
    }

    public void singleValueIsReturned() {
        // Returns the number itself when only one value is passed
        Assert.assertEquals(1, stringCalc.calculate("1"));
        Assert.assertEquals(2, stringCalc.calculate("2"));
    }



}
