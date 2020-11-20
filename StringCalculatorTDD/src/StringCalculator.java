import org.junit.Test;

public class StringCalculator {

    private String delimiter = "\\D+";

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    public int Add(String input) {
        String[] numbers = input.split(delimiter);

        if(input.isEmpty()) {
            return 0;
        }
        if(input.length() == 1) {
            return stringToInt(input);
        }
        else {
            int sum = 0, i;
            if(numbers[0].isEmpty()) {
                i = 1;
            }
            else {
                i = 0;
            }
            for(; i<numbers.length; i++) {
                int number = stringToInt(numbers[i]);
                if(number > 1000) {
                    continue;
                }
                sum += number;
            }
            return sum;
        }
    }
}
