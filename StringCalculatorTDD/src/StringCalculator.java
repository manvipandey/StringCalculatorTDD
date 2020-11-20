import org.junit.Test;

public class StringCalculator {

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    public int calculate(String input) {
        if(input.isEmpty()) {
            return 0;
        }
        return stringToInt(input);
    }
}
