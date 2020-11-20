import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {

    @Test
    public void emptyStringReturnsZero() {
        StringCalculator stringCalc = new StringCalculator();

        // Returns 0 when an empty string is passed
        Assert.assertEquals(0, stringCalc.calculate(""));
    }



}
