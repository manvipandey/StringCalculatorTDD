import org.junit.Test;

public class StringCalculator {

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    public int calculate(String input) {
        String[] numbers = input.split(",");

        if(input.isEmpty()) {
            return 0;
        }
        if(input.length() == 1) {
            return stringToInt(input);
        }
        else {
            return stringToInt(numbers[0]) + stringToInt(numbers[1]);
        }
    }
}
